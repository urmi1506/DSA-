package Trees;
import java.util.*;
public class SumTree {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isSumTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            root = stack1.pop();
            stack2.add(root);
            if (root.left != null) stack1.push(root.left);
            if (root.right != null) stack1.push(root.right);
        }

        // Stack2 now contains nodes in postorder.
        while (!stack2.isEmpty()) {
            TreeNode node = stack2.pop();

            int leftSum = (node.left != null) ? node.left.data : 0;
            int rightSum = (node.right != null) ? node.right.data : 0;

            if (node.left != null || node.right != null) {
                if (node.data != leftSum + rightSum) {
                    return false;
                }
            }

            // Update node data to include the sum of the entire subtree
            node.data += leftSum + rightSum;
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(26);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(3);

        if (isSumTree(root)) {
            System.out.println("The given tree is a Sum Tree");
        } else {
            System.out.println("The given tree is not a Sum Tree");
        }
    }
}
