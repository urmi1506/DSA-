package Trees;

public class BalancedBT{

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

    public static boolean isBalanced(TreeNode root) {

        return height(root) != -1;
    }

    private static int height(TreeNode node) {
        if (node == null) return 0;

        //check height of left tree
        int left = height(node.left);
        if (left == -1) return -1;
        
        //check height of right tree
        int right = height(node.right);
        if (right == -1) return -1;
        
        //check is tree is balanced or not
        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        boolean isBalanced = isBalanced(root);
        System.out.println(isBalanced);
    }
}