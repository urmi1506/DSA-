package LinkedList;

public class LLBinaryTree{
    public static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
        
       
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
    
           public static boolean isSubPath(ListNode head, TreeNode root) {
               return dfs(head, head, root);  
           }
       
           static boolean  dfs(ListNode head, ListNode curr, TreeNode root) {
               
               if (curr == null) return true;
               if (root == null) return false;
               
               if (curr.val == root.val) curr = curr.next;
               else if (head.val == root.val) head = head.next;
               else curr = head;
       
               return dfs(head, curr, root.left) || dfs(head, curr, root.right);
           }
       public static void main(String[] args) {
        ListNode head = [4,2,8], TreeNode root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
       }
}