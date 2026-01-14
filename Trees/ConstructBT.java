package Trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructBT {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        // create map & add inorder to it
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        // build tree
        TreeNode root = buildTree(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1, inMap);

        return root;
    }

    public static TreeNode buildTree(int[] preorder, int prestart, int preEnd,
            int[] inorder, int instart, int inEnd, Map<Integer, Integer> inMap) {

        if (prestart > preEnd || instart > inEnd)
            return null;

        // Find root through preorder
        TreeNode root = new TreeNode(preorder[prestart]);

        // check whr root +nt in inorder
        int inRoot = inMap.get(root.val);
        // check leftside of inorder
        int numLeft = inRoot - instart;

        // build LeftTree
        root.left = buildTree(preorder, prestart + 1, prestart + numLeft,
                inorder, instart, inRoot - 1, inMap);
        // build rightTree
        root.right = buildTree(preorder, prestart + numLeft + 1, preEnd,
                inorder, inRoot + 1, inEnd, inMap);

        return root;

    }

    public static void main(String[] args) {
        int preorder[] = { 3, 9, 20, 15, 7 };
        int inorder[] = { 9, 3, 15, 20, 7 };

        TreeNode root = buildTree(preorder, inorder);

        printInorder(root);
    }

    public static void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}
