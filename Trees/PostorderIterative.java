package Trees;

import java.util.ArrayList;

public class PostorderIterative {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right=null;
        }
    }

    ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        postOrderhelper(node, res);
        return res;
    }

    private void postOrderhelper(Node node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }

        postOrderhelper(node.left, res);
        postOrderhelper(node.right, res);
        res.add(node.data);
    }

    public static void main(String[] args) {
        PostorderIterative tree = new PostorderIterative();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        ArrayList<Integer> postOrderResult = tree.postOrder(root);

        System.out.println(postOrderResult);
    }
}
