package Trees;

public class BuildBST {

    static class TreeNode{
        TreeNode left ,right;
        int val;
        public TreeNode(int val){
            this.val= val;
            left =null;
            right=null;
        }
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        
      return buildTree(preorder ,0 , preorder.length-1);
    }
    public static TreeNode buildTree(int[] preorder ,int prestart ,int preEnd){
        // Edge case 
        if(prestart > preEnd) return null;

        // Find Root
        TreeNode root =new TreeNode(preorder[prestart]);

        // Find ele > root
        int idx = prestart + 1;
        while(idx <= preEnd && preorder[idx] < root.val) idx++;

        // if ele < root --left
        root.left = buildTree(preorder,prestart+1 , idx-1);
        // ele > root -- right
        root.right = buildTree(preorder,idx ,preEnd);

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
