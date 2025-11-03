package Trees;

import java.util.ArrayList;

public class PostorderIterative {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right=null;
        }
    }

    static ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(node, res);
        return res;
    }

    private static void helper(Node node, ArrayList<Integer> res) {
        // Base Case
        if (node == null) {
            return;
        }
        // Left, Right, Root
        helper(node.left, res);
        helper(node.right, res);
        res.add(node.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> Res = postOrder(root);

        System.out.println(Res);
    }
}
