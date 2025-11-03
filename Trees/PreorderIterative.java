package Trees;

import java.util.ArrayList;

public class PreorderIterative {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right=null;
        }
    }

     ArrayList<Integer> preOrder(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(node, res);
        return res;
    }

    private  void helper(Node node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }

        res.add(node.data);
        helper(node.left, res);
        helper(node.right, res);
    }

    public static void main(String[] args) {
        PreorderIterative tree = new PreorderIterative();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> preOrderResult = tree.preOrder(root);

        System.out.println(preOrderResult);
    }
}
