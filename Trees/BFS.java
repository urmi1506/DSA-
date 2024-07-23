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
    public List<List<Integer>> levelorder(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer> subList=new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if(queue.peek().left !=null) queue.offer(queue.peek().left);
                if(queue.peek().right !=null) queue.offer(queue.peek().right);

                subList.add(queue.poll().data);
            }
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

        BFS bfs = new BFS();
        List<List<Integer>> result = bfs.levelorder(root);
        
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
