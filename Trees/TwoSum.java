package Trees;

import java.util.HashSet;

public class TwoSum {
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
        }
    }
    
    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> visited = new HashSet<>();
        return dfs(root, k, visited);
    }

    private static boolean dfs(TreeNode node, int k, HashSet<Integer> visited) {
        if (node == null) return false;

        int moreNeeded = k - node.val;
        if (visited.contains(moreNeeded)) return true;

        visited.add(node.val);

        return dfs(node.left, k, visited) || dfs(node.right, k, visited);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int k = 9;
        boolean res = findTarget(root, k);
        System.out.println(res);
    }
}

