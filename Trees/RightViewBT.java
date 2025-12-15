package Trees;

import java.util.ArrayList;
import java.util.List;

class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
public class RightViewBT {
    public static List<Integer> rightSideView(Node root) {
        List<Integer> res =new ArrayList<>();
        rightView(root , res , 0);
    return res;
        
    }
    public static void rightView(Node curr , List<Integer> res , int currLevel){
        if(curr == null) return;
        
        //Root -- right -- left
        // level matched size
        if(currLevel == res.size()) res.add(curr.data);

        rightView(curr.right , res ,currLevel + 1);
        rightView(curr.left , res , currLevel+1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.left.right = new Node(5);
        root.right.right.right = new Node(6);

        System.out.println(rightSideView(root));
    }
}
