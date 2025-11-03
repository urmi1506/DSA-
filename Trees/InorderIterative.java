package Trees;

import java.util.ArrayList;

public class InorderIterative {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right=null;
        }
    }
    
    static ArrayList<Integer> inOrder(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(node, res);
        return res;
    }

    private static void helper(Node node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }

        helper(node.left, res);
        res.add(node.data);
        helper(node.right, res);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> Res = inOrder(root);

        System.out.println(Res);
    }
}
