package Trees;

public class MinDepthBT {
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static int minDepth(TreeNode root) {
        if(root == null ) return 0;

        int lh = minDepth(root.left);
        int rh =minDepth(root.right);
        
        if(root.left == null) return rh+1;
        if(root.right == null) return lh+1;

    return Math.min(lh , rh)+1;
    }
    public static void main(String[] args) {
        
    
    TreeNode root = new TreeNode(-10);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    int res = minDepth(root);

    System.out.println("Min Depth: " + res);
    }
}

