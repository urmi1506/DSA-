package Trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
         // create map & add inorder to it
        HashMap<Integer,Integer> inMap = new HashMap<>();
        for(int i =0; i<inorder.length; i++){
            inMap.put(inorder[i],i);
        }
        // build tree
        TreeNode root = buildTree(postorder ,0,postorder.length -1,
                                  inorder ,0, inorder.length-1 ,inMap);

    return root;
    }
    public static TreeNode buildTree(int[] postorder , int poststart ,int postEnd,
                              int[] inorder ,int instart ,int inEnd ,Map<Integer,Integer>inMap){

        if(poststart > postEnd || instart > inEnd) return null;
        
        // Find root through preorder 
        TreeNode root = new TreeNode(postorder[postEnd]);
        
        // check whr root +nt in inorder
        int inRoot = inMap.get(root.val);
        // check leftside of inorder
        int numLeft = inRoot - instart;
        
        // build LeftTree
        root.left = buildTree(postorder , poststart ,poststart + numLeft-1 ,
                              inorder ,instart,inRoot-1 ,inMap);
        // build rightTree
        root.right =  buildTree(postorder , poststart + numLeft ,postEnd-1 ,
                              inorder ,inRoot+1 ,inEnd  ,inMap);      

    return root;              
                             
     }
     public static void main(String[] args) {
         int inorder[] = {9,3,15,20,7};
         int postorder[] = {9,15,7,20,3};

        TreeNode root = buildTree( inorder,postorder);

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
