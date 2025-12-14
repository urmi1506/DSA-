package Trees;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
public class MaxHeight {
    public static int maxDepth(TreeNode root) {
        //Base Case
        if(root == null) return 0;

        // check left height
        int lh =maxDepth(root.left);
        //check right height
        int rh =maxDepth(root.right);

    return 1+Math.max(lh, rh);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        int ans = maxDepth(root);
        System.out.println(ans);

    }
}
