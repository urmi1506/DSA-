package Trees;

import java.util.ArrayList;
import java.util.List;

public class LargeVal {
     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
    private static List<Integer> res;
    public static List<Integer> largestValues(TreeNode root) {
        res = new ArrayList<>();
        dfs(root, 0);

        return res;
    }

    private static void dfs(TreeNode root, int level) {
        if (root != null) {
            int val = root.val;
            
            if (res.size() == level) 
                res.add(val);
            else 
                res.set(level, Math.max(res.get(level), val));
            
            dfs(root.left, level + 1);
            dfs(root.right, level + 1);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        System.out.println(largestValues(root));
    }
}

