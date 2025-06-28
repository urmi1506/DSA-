package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    public static class Node {
      int val;
      Node left;
      Node right;
      Node(int val){
        this.val=val;
        this.left=right=null;

      }
    
      
  }
    public static List<Integer> preorderTraversal(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        helper(root, res);
        return res;
    }
    private static void helper(Node node ,ArrayList<Integer>res){
        if(node == null) return  ;

        res.add(node.val);
        helper(node.left,res);
        helper(node.right,res);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> Result = (ArrayList<Integer>) preorderTraversal(root);

        System.out.println(Result);
    }
        
}

