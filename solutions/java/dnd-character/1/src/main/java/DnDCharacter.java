import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

class DnDCharacter {
    int strength, dexterity, constitution, intelligence, wisdom, charisma, hitPoints;;

    public DnDCharacter() {
        int[] a = Stream.generate(this::rollDice).limit(6).mapToInt(this::ability).toArray();
        strength = a[0];
        dexterity = a[1];
        constitution = a[2];
        intelligence = a[3];
        wisdom = a[4];
        charisma = a[5];
        hitPoints = 10 + modifier(constitution);
    }

    int ability(List<Integer> scores) {
        return scores.stream().sorted(Comparator.reverseOrder())
                .limit(3).mapToInt(Integer::intValue).sum();
    }

    List<Integer> rollDice() {
        return IntStream.range(0, 4).map(i -> (int) (Math.random() * 6) + 1).boxed().toList();
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitPoints;
    }
}