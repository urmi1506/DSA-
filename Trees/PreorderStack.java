package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderStack {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
        
    }
    public static List<Integer> preorderTraversal(TreeNode root){
       List<Integer>preorder =new ArrayList<Integer>();
       Stack<TreeNode> stack=new Stack<TreeNode>();
    //Base case
       if (root==null) return preorder;

       stack.push(root);
    // check Preorder
       while(!stack.isEmpty()){
        root =stack.peek();
        stack.pop();
        preorder.add(root.data);
        // check right
        if(root.right != null) stack.push(root.right);
        // check left
        if(root.left != null) stack.push(root.left);
       }
    return preorder;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> Res = preorderTraversal(root);

        System.out.println(Res);
    }
}
