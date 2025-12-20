package Trees;

import java.util.*;

public class ZigzagOrderBT {
    static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val){
            this.val=val;
            right=null;
            left=null;
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }
    
    private static void helper(TreeNode curr, List<List<Integer>> res, int level)
    {
        if(curr == null) return;
        
        if(res.size() <= level)
        {
            List<Integer> newLevel = new LinkedList<>();
            res.add(newLevel);
        }
        
        List<Integer> collection  = res.get(level);
        if(level % 2 == 0) collection.add(curr.val);
        else collection.add(0, curr.val);
        
        helper(curr.left, res, level + 1);
        helper(curr.right, res, level + 1);
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        List<List<Integer>> res = zigzagLevelOrder(root);
        System.out.println(res);
      
      
    }
}
