package Trees;

public class CeilBST {
    static class Node {
        int data;
        Node left, right;
    

        Node(int data) {
            this.data = data;
        }
    }
    public static int ceil(Node root, int x) {
      int ans = -1;
    while (root != null) {
        if (root.data == x)
            return root.data;

        if (root.data > x) {
            ans = root.data;
            root = root.left;
        } else {
            root = root.right;
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        Node root =new Node(6);
        root.right =new Node(8);
        root.right.left=new Node(7);
        root.right.right=new Node(9);

        int res = ceil(root, 5);
        System.out.println(res);
    }
}
