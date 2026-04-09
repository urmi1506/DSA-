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
        // Empty root --return empty list
        if (root == null) return l;
        
        // only one node --root is leaf
        if (root.left == null && root.right == null) {
            l.add(root.data);
            return l;
        }
        
        // add root node
        l.add(root.data);

        // check left subtree
        if (root.left != null) {
            findleft(root.left);
        }
        
        // check leaf node
        leafNode(root);
        
        // check right subtree
        if (root.right != null) {
            findright(root.right);
        }
        
        // return final traversal
        return l;
    }

    static void findleft(Node root) {
        // base case
        if (root == null) return;
        
        // leaf node --skip
        if (root.left == null && root.right == null) return;
        
        // add curr node
        l.add(root.data);
        
        // check left --> right
        if (root.left != null) {
            findleft(root.left);
        } else {
            findleft(root.right);
        }
    }

    static void leafNode(Node root) {
        // base case
        if (root == null) return;
        
        // leaf node --add it
        if (root.left == null && root.right == null) {
            l.add(root.data);
            return;
        }
        // check left ---> right
        leafNode(root.left);
        leafNode(root.right);
    }
    
    static void findright(Node root) {
        // base case
        if (root == null) return;
        // leaf node skip it
        if (root.left == null && root.right == null) return;
        
        // check right ---> left
        if (root.right != null) {
            findright(root.right);
        } else {
            findright(root.left);
        }
        // add after recursion ---bottom to top
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
