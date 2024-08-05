package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class pair{
    int pos;
    Node node;
    pair(int pos,Node node){
        this.pos = pos;
        this.node = node;
    }
 }
 
public class BottomView {
     public static ArrayList <Integer> bottomView(Node root)
    {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(0,root));
        while(!queue.isEmpty()){
            int m = queue.size();
            for(int i=0;i<m;i++){
                pair p = queue.poll();
                int d = p.pos;
                Node n = p.node;
                if(n.left!=null) queue.add(new pair(d-1,n.left));
                if(n.right!=null) queue.add(new pair(d+1,n.right));
                map.put(d,n.data);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int k : map.keySet()){
            res.add(map.get(k));
        }
        return res;
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println(bottomView(root));
        
    }
}
