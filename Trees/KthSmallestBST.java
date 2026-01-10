package Trees;

import java.util.Stack;

public class KthSmallestBST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while (true) {
          while (root != null) {
            stack.push(root);
            root = root.left;
          }

        if (stack.isEmpty()) {
                return -1;
            }

        root = stack.pop();
        k--;

        if (k == 0) return root.val;

        root = root.right;
    }
  }
  public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);

        int k=2;

        int res = kthSmallest(root, k);
        System.out.println(res);
  }
}
