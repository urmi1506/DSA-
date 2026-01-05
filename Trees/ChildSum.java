package Trees;

public class ChildSum {
    static class Node {
        int data;
        Node left, right;

        Node(int key) {
            data = key;
            left = right = null;
        }
    }

    public static boolean isSumProperty(Node root) {
        // Edge Cases
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        // check left & right subtree
        int leftSum = 0, rightSum = 0;
        if (root.left != null)
            leftSum = root.left.data;
        if (root.right != null)
            rightSum = root.right.data;

        // check curr node & left and right subtree
        return (root.data == leftSum + rightSum)
                && isSumProperty(root.left)
                && isSumProperty(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);

        boolean result = isSumProperty(root);
        System.out.println(result);
    }
}
