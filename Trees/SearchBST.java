package Trees;


public class SearchBST {
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static TreeNode searchBST(TreeNode root ,int val){
        // Edge case
        if(root == null) return null;
        //check exact val
        if(root.val == val) return root;
        //check left ---root.val > val
        else if (root.val > val) return searchBST(root.left, val);
        //check right ---root.val < val
        else return searchBST(root.right, val);

    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(4);
        root.left =new TreeNode(2);
        root.left.left =new TreeNode(1);
        root.left.right =new TreeNode(3);
        root.right =new TreeNode(7);

        TreeNode ans = searchBST(root, 2);
        System.out.println(ans != null ? ans.val : "Not found");

    }
}
