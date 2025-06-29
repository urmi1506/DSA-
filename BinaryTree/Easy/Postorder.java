package Easy;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
    static class Node{
        int val;
        Node right;
        Node left;

        Node(int val){
            this.val=val;
            this.right=left=null;
        }
    }
    public static List<Integer> postorderTraversal(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        helper(root, res);
        return res;
    }
    private static void helper(Node node ,ArrayList<Integer>res){
        if(node == null) return  ;

        helper(node.left,res);
        helper(node.right,res);
        res.add(node.val);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> Result = (ArrayList<Integer>) postorderTraversal(root);

        System.out.println(Result);
    }
}
