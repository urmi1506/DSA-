package Trees;

public class ValidateBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    public static boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValid(TreeNode node, long mini, long maxi) {
        if (node == null)
            return true;

        if (node.val <= mini || node.val >= maxi)
            return false;

        return isValid(node.left, mini, node.val)
                && isValid(node.right, node.val, maxi);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean ans = isValidBST(root);
        System.out.println(ans);
    }
}
