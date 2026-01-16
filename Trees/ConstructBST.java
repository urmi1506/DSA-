package Trees;

public class ConstructBST {
    static class TreeNode{
        TreeNode left ,right;
        int val;
        public TreeNode(int val){
            this.val= val;
            left =null;
            right=null;
        }
    }
    static int idx = 0;
    public static TreeNode bstFromPreorder(int[] preorder) {
        
      return buildTree(preorder ,Integer.MIN_VALUE ,Integer.MAX_VALUE);
    }
    public static TreeNode buildTree(int[] preorder ,int min ,int max){
        if(idx >= preorder.length ) return null;

        int val =preorder[idx];
        if(val <= min || val >= max) return null;

        idx++;
        
        TreeNode root = new TreeNode(val);
        // if ele < root --left
        root.left = buildTree(preorder,min ,val);
        // ele > root -- right
        root.right = buildTree(preorder,val ,max);

    return root;
    }
    public static void main(String[] args) {
        int [] preorder ={8,5,1,7,10,12};
        
        TreeNode root = bstFromPreorder(preorder);
        printInorder(root);
    }
    public static void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

}
