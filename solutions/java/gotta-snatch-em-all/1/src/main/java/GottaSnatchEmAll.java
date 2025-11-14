import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return myCollection.stream().anyMatch(c -> !theirCollection.contains(c)) && theirCollection.stream().anyMatch(c -> !myCollection.contains(c));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
         return collections.stream().skip(1)
             .reduce(new HashSet<>(collections.get(0)), (a, b) -> { a.retainAll(b); return a; });
    }

    static Set<String> allCards(List<Set<String>> collections) {
        return collections.stream().skip(1)
            .reduce(new HashSet<>(collections.get(0)), (a, b) -> { a.addAll(b); return a; });
    }
}
