package Trees;

public class IdenticalTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case
        if (p == null && q == null) {
            return true;
        }
        // If only one tree is null or val are different--not identical
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // check if left & right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSameTree(p, q));
    }

}
