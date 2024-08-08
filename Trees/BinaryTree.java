package Trees;

public class BinaryTree {
    static class Node{
        int data;
        Node left,right;
        // without this constructor cant able to assign val
        Node(int key){
            // assign key to data
            data=key;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        // use .data to fetch real val
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

    }
}
