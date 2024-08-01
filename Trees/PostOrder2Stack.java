package Trees;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class PostOrder2Stack {
   
    static class TreeNode {
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
    public static List<Integer> postorderTraversal(TreeNode root){
       List<Integer>postorder =new ArrayList<Integer>();
       Stack<TreeNode> stack1=new Stack<TreeNode>();
       Stack<TreeNode> stack2=new Stack<TreeNode>();

       if (root==null) return postorder;
       stack1.push(root);
       while(!stack1.isEmpty()){
        root =stack1.pop();
        stack2.add(root);
        if(root.left != null) stack1.push(root.left);
        if(root.right != null) stack1.push(root.right);
       }
       while(!stack2.isEmpty()){
        postorder.add(stack2.pop().data);
       }
    return postorder;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> postOrderResult = postorderTraversal(root);

        System.out.println(  postOrderResult);
    }
}


