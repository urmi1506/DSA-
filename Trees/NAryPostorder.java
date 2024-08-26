package Trees;

import java.util.ArrayList;
import java.util.List;

public class NAryPostorder {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
            children = new ArrayList<>();
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversal(root, res);
        return res;
    }

    private void postorderTraversal(Node node, List<Integer> res) {
        if (node == null) {
            return;
        }

        for (Node child : node.children) {
            postorderTraversal(child, res);
        }

        res.add(node.val);
    }

    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> childrenOfNode3 = new ArrayList<>();
        childrenOfNode3.add(node5);
        childrenOfNode3.add(node6);
        Node node3 = new Node(3, childrenOfNode3);

        Node node2 = new Node(2);
        Node node4 = new Node(4);

        List<Node> childrenOfRoot = new ArrayList<>();
        childrenOfRoot.add(node3);
        childrenOfRoot.add(node2);
        childrenOfRoot.add(node4);
        Node root = new Node(1, childrenOfRoot);

        NAryPostorder tree = new NAryPostorder();
        List<Integer> result = tree.postorder(root);

        System.out.println(result); 
    }
}
