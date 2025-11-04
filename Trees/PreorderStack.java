package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderStack {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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
        PreorderStack tree = new PreorderStack();
        TreeNode root = tree.new TreeNode(1);
        root.left = tree.new TreeNode(2);
        root.right = tree.new TreeNode(3);
        root.left.left = tree.new TreeNode(4);
        root.left.right = tree.new TreeNode(5);

        List<Integer> Res = preorderTraversal(root);

        System.out.println(Res);
    }
}
