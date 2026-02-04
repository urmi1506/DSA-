package Graph;

import java.util.*;

public class CloneGraph {

    public static ArrayList neighbors;

    static class Node {
        public int val;
        public ArrayList<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    // map to store original -> clone
    static Map<Node, Node> map = new HashMap<>();

    public static Node cloneGraph(Node node) {
        // Base case
        if (node == null) return null;

        // Already cloned
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // Clone node
        Node copy = new Node(node.val);
        map.put(node, copy);

        // Clone neighbors correctly
        for (Node nei : node.neighbors) {
            copy.neighbors.add(cloneGraph(nei));
        }

        return copy;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);

        n3.neighbors.add(n2);
        n3.neighbors.add(n4);

        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        Node cloned = cloneGraph(n1);

        System.out.println(cloned);
        
    }
}
