package Trees; 


public class MaxSumPath {
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int ans = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        dfs(root);
        return ans;
    }

    static int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        // Max path THROUGH current node
        ans = Math.max(ans, node.val + left + right);

        // Max path going DOWN from current node
        return node.val + Math.max(left, right);
    }
    public static void main(String[] args) {
    TreeNode root = new TreeNode(-10);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    int res = maxPathSum(root);

    System.out.println("Maximum Path Sum: " + res);
    }
}
