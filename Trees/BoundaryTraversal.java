package Trees;

import java.util.ArrayList;

public class BoundaryTraversal {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static ArrayList<Integer> l = new ArrayList<>();

    static ArrayList<Integer> boundaryTraversal(Node root) {
        if (root == null)
            return l;

        if (root.left == null && root.right == null) {
            l.add(root.data);
            return l;
        }

        l.add(root.data);

        if (root.left != null) {
            findleft(root.left);
        }

        leafNode(root);

        if (root.right != null) {
            findright(root.right);
        }

        return l;
    }

    static void findleft(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;

        l.add(root.data);

        if (root.left != null) {
            findleft(root.left);
        } else {
            findleft(root.right);
        }
    }

    static void leafNode(Node root) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            l.add(root.data);
            return;
        }

        leafNode(root.left);
        leafNode(root.right);
    }

    static void findright(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;

        if (root.right != null) {
            findright(root.right);
        } else {
            findright(root.left);
        }

        l.add(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);

        ArrayList<Integer> res = boundaryTraversal(root);
        for (int ans : res) {
            System.out.print(ans + " ");
        }
    }

}
