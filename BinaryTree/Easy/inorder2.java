package Easy;

public class inorder2 {
    public static class Node{
        int data;
        Node left,right;
        Node(int key){
            data=key;
            left=right=null;
        }
    }                        
    static void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorder(root);
    }
}


