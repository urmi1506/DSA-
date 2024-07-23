package Trees;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {
    class TreeNode {
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
     // Use answer to store traversal of nodes.
    private static List<Integer> answer;

    private static void inOrder(TreeNode node) {

        // Base case.
        if (node == null) {
            return;
        }

        // Visit left subtree.
        inOrder(node.left);

        // Add data of node to answer.
        answer.add(node.data);

        // Visit right subtree.
        inOrder(node.right);
    }

    private static List<Integer> getInOrderTraversal(TreeNode root) {

        // Clear contents of answer before every test case.
        answer = new ArrayList<>();

        // Call inOrder function and store inOrder traversal in answer array.
        inOrder(root);

        // Return answer.
        return answer;

    }

    private static void preOrder(TreeNode node) {

        // Base case.
        if (node == null) {
            return;
        }
        // Add data of node to answer.
        answer.add(node.data);

        // Visit left subtree.
        preOrder(node.left);

        // Visit right subtree.
        preOrder(node.right);
    }

    private static List<Integer> getPreOrderTraversal(TreeNode root) {

        // Clear contents of answer before every test case.
        answer = new ArrayList<>();

        // Call preOrder function and store preOrder traversal in answer array.
        preOrder(root);

        // Return answer.
        return answer;
    }

    private static void postOrder(TreeNode node) {

        // Base case.
        if (node == null) {
            return;
        }

        // Visit left subtree.
        postOrder(node.left);

        // Visit right subtree.
        postOrder(node.right);

        // Add data of node to answer.
        answer.add(node.data);

    }

    private static List<Integer> getPostOrderTraversal(TreeNode root) {

        // Clear contents of answer before every test case.
        answer = new ArrayList<>();

        // Call postOrder function and store postOrder traversal in answer array.
        postOrder(root);

        // Return answer.
        return answer;
    }

    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        answer = new ArrayList<>();

        // Call function to get inOrder Traversal.
        result.add(getInOrderTraversal(root));

        // Call function to get preOrder Traversal.
        result.add(getPreOrderTraversal(root));

        // Call function to get postOrder Traversal.
        result.add(getPostOrderTraversal(root));

        // Return all 3 tree traversals.
        return result;
    }
}
