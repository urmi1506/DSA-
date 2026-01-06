package Trees;

public class LCAofBST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null )
            return root;

        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);

        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);

        
        return root;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);

        TreeNode p = root.right;
        TreeNode q = root.left.left;

        TreeNode ans = lowestCommonAncestor(root, p, q);
        System.out.println(ans.val);

    }
}