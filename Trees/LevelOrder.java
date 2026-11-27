package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left,right;
        TreeNode(int key){
            val=key;
        }
}
public class LevelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // store whole res
        List<List<Integer>> list = new ArrayList<>();
        // Base case
        if(root == null) return list;
        // Queue -->BFS
        Queue<TreeNode> queue = new LinkedList<>();
        // add root to queue;
        queue.offer(root);

        while(!queue.isEmpty()){
            // req sublist to store level wise res
            List<Integer> sublist = new ArrayList<>();
            int currLevel =queue.size();

            // traverse upto currLevel
            for(int i=0; i<currLevel; i++){
                // store curr Node
                TreeNode curr = queue.poll();
                // add it to sublist
                sublist.add(curr.val);
                // check Left tree
                if(curr.left != null)
                    queue.offer(curr.left);
                // check right tree
                if(curr.right != null)
                    queue.offer(curr.right);
            }
        // add to list
        list.add(sublist);
        }
    return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       
        List<List<Integer>> res = levelOrder(root);
        
        for (List<Integer> level : res) {
            System.out.println(level);
        }
    }


}
