package Trees;

public class ReverseLevel {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode() {}
        
        TreeNode(int val) {
            this.val = val;
        }
        
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode reverseOddLevels(TreeNode root) {
        bfs(root.left, root.right, 1);
        return root;
    }

    private static void bfs(TreeNode node1, TreeNode node2, int level) {
        if (node1 == null || node2 == null) {
            return;
        }

        if (level % 2 == 1) {
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }

        bfs(node1.left, node2.right, level + 1);
        bfs(node1.right, node2.left, level + 1);
    }

    public static void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Original tree:");
        printInOrder(root);

        reverseOddLevels(root);

        System.out.println("\nTree after reversing odd levels:");
        printInOrder(root);
    }
}
