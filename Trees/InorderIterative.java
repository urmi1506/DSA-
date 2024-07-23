package Trees;

import java.util.ArrayList;

public class InorderIterative {

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

    ArrayList<Integer> inOrder(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        inOrderHelper(node, res);
        return res;
    }

    private void inOrderHelper(Node node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }

        inOrderHelper(node.left, res);
        res.add(node.data);
        inOrderHelper(node.right, res);
    }

    public static void main(String[] args) {
        InorderIterative tree = new InorderIterative();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        ArrayList<Integer> inOrderResult = tree.inOrder(root);

        System.out.println(inOrderResult);
    }
}
