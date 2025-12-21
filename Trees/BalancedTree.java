package Trees;

public class BalancedTree {
    
    static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val){
            this.val=val;
            right=null;
            left=null;
        }
    }
    public static boolean isBalancedTree( TreeNode root){
        // Base case
        if(root==null) return true;

        // check height left & right tree
        int lh = height(root.left);
        int rh = height(root.right);

        // check is balanced tree or not
        if(Math.abs(lh - rh) >1) return false;

        // check next node is balanced or not
        boolean left =isBalancedTree(root.left);
        boolean right =isBalancedTree(root.right);

    // return true if both right & left tree balanced
    return left && right;
    }
    private static int height(TreeNode node){
        if(node == null) return 0;

    return Math.max(height(node.left) , height(node.right))+1;
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        boolean isBalanced = isBalancedTree(root);
        System.out.println(isBalanced);
    }
}
