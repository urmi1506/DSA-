package Trees;

import java.util.ArrayList;

public class PreorderIterative {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    ArrayList<Integer> preOrder(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        preOrderHelper(node, res);
        return res;
    }

    private void preOrderHelper(Node node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }

        res.add(node.data);
        preOrderHelper(node.left, res);
        preOrderHelper(node.right, res);
    }

    public static void main(String[] args) {
        PreorderIterative tree = new PreorderIterative();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        ArrayList<Integer> preOrderResult = tree.preOrder(root);

        System.out.println(preOrderResult);
    }
}
