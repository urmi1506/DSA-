package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderStack {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static List<Integer> preorderTraversal(TreeNode root){
       List<Integer>preorder =new ArrayList<Integer>();
       if (root==null) return preorder;
       Stack<TreeNode> stack=new Stack<TreeNode>();
       stack.push(root);
       while(!stack.isEmpty()){
        root =stack.peek();
        stack.pop();
        preorder.add(root.data);
        if(root.right != null) stack.push(root.right);
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

        List<Integer> preOrderResult = preorderTraversal(root);

        System.out.println(  preOrderResult);
    }
}
