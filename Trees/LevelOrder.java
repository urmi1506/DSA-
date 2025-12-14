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
    public static List<List<Integer>> levelorder(TreeNode root){
        //initialize double list --store res
        List<List<Integer>> list = new ArrayList<>();
        //Edge case
        if(root == null) return list;
        
        // queue & add root in it
        Queue<TreeNode> q =  new LinkedList<TreeNode>();
        q.offer(root);


        //proceed upto its empty
        while(!q.isEmpty()){
            //initialize sublist to store level vise data
            List<Integer> sublist = new ArrayList<Integer>();

            // level size 
            int k = q.size();

            //traverse upto curr level
            for (int i = 0; i < k; i++) {
                //pop node
                TreeNode p = q.poll();
                //add val
                sublist.add(p.val);
                //push childrens
                if(p.left != null) q.offer(p.left);
                if(p.right != null) q.offer(p.right);

            }
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

       
        List<List<Integer>> res = levelorder(root);
        
        for (List<Integer> level : res) {
            System.out.println(level);
        }
    }


}
