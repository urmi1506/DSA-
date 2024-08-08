package Trees;

public class Traversals {
    static class Node{
        int data;
        Node left,right;
        Node(int key){
            data=key;
        }
    }
    static void preorder(Node node){
        if(node == null) return;

        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);

    }
    static void inorder(Node node){
        if(node == null)return;

        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    static void postorder(Node node){
        if(node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        System.out.println("Preorder Traversal");
        preorder(root);
        System.out.println("");
        System.out.println("Inorder Traversal");
        inorder(root);
        System.out.println("");
        System.out.println("Postorder Traversal");
        postorder(root);
    }
}
