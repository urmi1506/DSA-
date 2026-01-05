package Trees;

public class FlattenBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void flatten(TreeNode root) {
        TreeNode curr = root;
        // check left-subtree
        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;

                // find rightmost node of left-subtree
                while (prev.right != null) {
                    prev = prev.right;
                }
                // attach rightmost node to curr node right
                prev.right = curr.right;
                // move left-subtree to right
                curr.right = curr.left;
                // nullify left
                curr.left = null;

            }
            curr = curr.right;
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);

        flatten(root);

        TreeNode curr = root;
        while (curr != null) {
            System.out.print(curr.val + "--> ");
            curr = curr.right;
        }

    }
}
