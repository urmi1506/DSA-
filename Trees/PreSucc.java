package Trees;
import java.util.*;

class PreSucc {
    static class Node {
        int data;
        Node left, right;
        Node(int x) {
            data = x;
            left = right = null;
        }
    }
    public static ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> res = new ArrayList<>();
        
        Node predecessor = null;
        Node curr = root;
        while (curr != null) {
            if (curr.data >= key) {
                curr = curr.left;
            } else {
                predecessor = curr;
                curr = curr.right;
            }
        }
        
        Node sucessor = null;
        curr = root;
        while (curr != null) {
            if (curr.data > key) {
                sucessor = curr;
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        
        res.add(predecessor);
        res.add(sucessor);
        
        return res;
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        int key = 6;

        ArrayList<Node> Res = findPreSuc(root,key);

         System.out.println("Predecessor: " + 
            (Res.get(0) != null ? Res.get(0).data : "null"));
        System.out.println("Successor: " + 
            (Res.get(1) != null ? Res.get(1).data : "null"));

    }
}