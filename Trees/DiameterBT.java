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
public class DiameterBT {
    
   static int diameter = 0;

public static int height(TreeNode root) {
    if (root == null) return 0;
    // check children height
    int lh = height(root.left);
    int rh = height(root.right);

    // update diameter
    diameter = Math.max(diameter, lh + rh);

    // return height
    return 1 + Math.max(lh, rh);
}

public static int diameterOfBinaryTree(TreeNode root) {
    diameter = 0;
    height(root);
    return diameter;
} 
public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    int ans = diameterOfBinaryTree(root);
    System.out.println(ans);
}

}
