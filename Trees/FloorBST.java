package Trees;

public class FloorBST {
    static class Node {
        int data;
        Node left, right;
    

        Node(int data) {
            this.data = data;
        }
    }
    public static int floor(Node root, int x) {
      int ans = -1;
    while (root != null) {
        if (root.data == x)
            return root.data;

        if (root.data < x) {
            ans = root.data;
            root = root.right;
        } else {
            root = root.left;
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        Node root =new Node(6);
        root.right =new Node(8);
        root.right.left=new Node(7);
        root.right.right=new Node(9);

        int res = floor(root, 0);
        System.out.println(res);
    }
}
