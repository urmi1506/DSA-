package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int key){
            data=key;
        }
    }
    public static List<List<Integer>> levelorder(TreeNode root){
        // store node level by level
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        // store the final ans
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        // Edge case
        if(root==null){
            return list;
        }
        // initially add root to queue
        queue.offer(root);
        // main loop
        while(!queue.isEmpty()){
            // get size of current level
            int levelNum=queue.size();
            // store node of curr level
            List<Integer> subList=new LinkedList<Integer>();
            // iteration nd check left & right
            for (int i = 0; i < levelNum; i++) {
                if(queue.peek().left !=null) queue.offer(queue.peek().left);
                if(queue.peek().right !=null) queue.offer(queue.peek().right);
            // add data of left & right to sublist and thn remove from it 
                subList.add(queue.poll().data);
            }
            // thn add to final list ...for whole ans
            list.add(subList);
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       
        List<List<Integer>> res = levelorder(root);
        
        for (List<Integer> level : res) {
            System.out.println(level);
        }
    }
}
