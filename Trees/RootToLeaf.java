package Trees;

import java.util.ArrayList;

public class RootToLeaf {
    static class Node {
        int data;
        Node left, right;
        

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        ArrayList<Integer> path =new ArrayList<>();
        helper(root , ans ,path);
        
    return ans;
    }
    private static void helper(Node node ,ArrayList<ArrayList<Integer>> ans,
    ArrayList<Integer> path ){
        if(node == null) return;
        
        path.add(node.data);
        if(node.left == null && node.right == null){
            ans.add(new ArrayList<>(path));
        }
        helper(node.left , ans,path);
        helper(node.right , ans,path);
        
    path.remove(path.size()-1);
    }
    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<ArrayList<Integer>> result = Paths(root);
        System.out.println(result);
    }
}
