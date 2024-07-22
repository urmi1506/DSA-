package Trees;

public class BinaryTreeRep {
    public static class Node{
        int data ;
        Node left,right;
        Node(int key){
            data=key;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);
    }
}
