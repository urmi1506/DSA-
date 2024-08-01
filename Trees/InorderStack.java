package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderStack {
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
     public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> inorder=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode node=root;
        while(true){
            if(node!= null){
                s.push(node);
                node=node.left;
            }else{ 
                if(s.isEmpty()){
                 break;
            }
            node=s.pop();
            inorder.add(node.data);
            node=node.right;
          }
        }
    return inorder;
     }
     public static void main(String[] args) {
       
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> inOrderResult = inorderTraversal(root);

        System.out.println(  inOrderResult);
     }
}
