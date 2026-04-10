package Trees;

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
    public static List<List<Integer>> levelorder(TreeNode root){
       // initialized double list --Store final ans
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        // initialized queue --traverse level wise
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        // Edge case
        if(root == null) return result;

        // add root to queue
        queue.offer(root);

        // Traverse 
        while(!queue.isEmpty()){
            // initialized sublist --store currlevel traversal
            List<Integer> sublist = new LinkedList<>();
            // check currlevel
            int currLevel = queue.size();

            // Traverse upto currlevel
            for(int i=0; i<currLevel; i++){
                // check left
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                // check right
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                //add data to sublist
                sublist.add(queue.poll().val);

            }
            //add sublist to res
            result.add(sublist);
            
        }
    return result;
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
