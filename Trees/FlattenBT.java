package Trees;

import java.util.*;

public class FlattenBT {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void flatten(TreeNode root) {
        if (root == null)
            return;
        // store preorder in list and give each node left as null
        List<TreeNode> list = new ArrayList<>();
        preorder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }

    }

    // preorder
    private static void preorder(TreeNode node, List<TreeNode> list) {
        if (node == null)
            return;

        list.add(node);
        preorder(node.left, list);
        preorder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);

        flatten(root);

    }
}
