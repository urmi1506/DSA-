package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderStack {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
     public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> inorder=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();

        TreeNode node=root;
        //Left Root Right
        // true = node! null || !s.isEmpty()
        while(true){
            if(node!= null){
                // push data to stack
                s.push(node);
                // check left
                node=node.left;
            }else{ 
                // stack empty ..break
                if(s.isEmpty()){
                 break;
            }
            // pop data
            node=s.pop();
            // add root node
            inorder.add(node.data);
            // check right
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

        List<Integer>Res = inorderTraversal(root);

        System.out.println(Res);
     }
}
