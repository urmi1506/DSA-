package Trees;

import java.util.ArrayList;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class LeftViewTree {
      static ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> res=new ArrayList<Integer>();
      leftViewHelper(root,res,0);
      return res;
    }
    static void leftViewHelper(Node currNode, ArrayList<Integer>res, int currDepth){
        if(currNode==null)return;
        
        if(currDepth==res.size()){
            res.add(currNode.data);
        }
        
        leftViewHelper(currNode.left,res,currDepth+1);
        leftViewHelper(currNode.right,res,currDepth+1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(3);
        root.right=new Node(2);
        System.out.println(leftView( root));
    }
}
