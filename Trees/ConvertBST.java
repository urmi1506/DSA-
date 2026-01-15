package Trees;
public class ConvertBST {
    public static  class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        } 
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
    
     return helper(nums , 0 ,nums.length- 1);
    }
    private static TreeNode helper(int[] nums , int left , int right){
        // Edge Case
        if(left > right) return null;

        // find mid 
        int mid =(left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        // check left & right
        root.left = helper(nums , left ,mid-1);
        root.right = helper(nums , mid+1 ,right);

    return root;
    }
    public static void main(String[] args) {
        int []nums ={-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);

        printPreorder(root);
    }
    public static void printPreorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
}
