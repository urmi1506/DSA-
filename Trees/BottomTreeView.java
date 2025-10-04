package Trees;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class BottomTreeView {

    static class Pair {
        Node node;
        int line;
        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    public static List<Integer> topView(Node root) {
        List<Integer> ans = new ArrayList<>();
        
        if (root == null) {
            return ans;
        }
        
        // Map to store the first node seen at each vertical position
        Map<Integer, Integer> mpp = new TreeMap<>();
        
        // Queue for BFS traversal
        Queue<Pair> q = new LinkedList<>();
        
        // Root node has vertical position 0
        q.add(new Pair(root, 0));
        
        // BFS traversal
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            Node node = temp.node;
            int line = temp.line;
            
            // Only diff in BottomView and top view
            mpp.put(line, node.data);

            
            // Left child → vertical line - 1
            if (node.left != null) {
                q.add(new Pair(node.left, line - 1));
            }
            
            // Right child → vertical line + 1
            if (node.right != null) {
                q.add(new Pair(node.right, line + 1));
            }
        }
        
        // Transfer map values to the result list (sorted order)
        ans.addAll(mpp.values());
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        List<Integer> topView = topView(root);

        System.out.println("Bottom View: ");
        for (int node : topView) {
            System.out.print(node + " ");
        }
    }
}
