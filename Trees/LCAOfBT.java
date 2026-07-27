package Trees;

public class LCAOfBT {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case:
        // If we reach the end of a branch, or find either p or q,
        // return the current node.
        if (root == null || p == root || q == root)
            return root;
        
        // search for p & q in left subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // search for p & q in right subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // one node on left & other on right Therefore current node is LCA
        if (left != null && right != null)
            return root;
        
        // Only one subtree contains p or q
        // so return that node upward.
        return left != null ? left : right;

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