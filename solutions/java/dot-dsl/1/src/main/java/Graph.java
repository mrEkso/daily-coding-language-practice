import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private final Collection<Node> nodes = new ArrayList<>();
    private final Collection<Edge> edges = new ArrayList<>();
    private final Map<String, String> attributes = new HashMap<>();

    public Graph() {
    }

    public Graph(Map<String, String> attributes) {
        this.attributes.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Graph node(String name) {
        return add(nodes, new Node(name));
    }

    public Graph node(String name, Map<String, String> attributes) {
        return add(nodes, new Node(name, attributes));
    }

    public Graph edge(String start, String end) {
        return add(edges, new Edge(start, end));
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        return add(edges, new Edge(start, end, attributes));
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    // Generic Helper
    private <T> Graph add(Collection<T> collection, T item) {
        collection.add(item);
        return this;
    }
}
