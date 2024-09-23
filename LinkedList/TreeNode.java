package LinkedList;

public  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public  class TreeNode {
   
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
public class LLBinaryTree {

    public static boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head, head, root);
    }

    static boolean dfs(ListNode head, ListNode curr, TreeNode root) {
        if (curr == null) return true;  // Linked list is fully traversed
        if (root == null) return false; // Reached the end of the tree branch

        if (curr.val == root.val) {
            curr = curr.next;  // Continue matching the linked list
        } else if (head.val == root.val) {
            curr = head.next;  // Start matching from head if root matches head value
        } else {
            curr = head;       // Reset the linked list pointer if no match
        }

        return dfs(head, curr, root.left) || dfs(head, curr, root.right);
    }

    public static void main(String[] args) {
        // Creating the linked list [4, 2, 8]
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);

        // Creating the binary tree [1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3]
        int first = 2;
        System.out.println(first);
        // TreeNode root = new TreeNode(1);
        // root.left = new TreeNode(4);
        // root.right = new TreeNode(4);
        // root.left.right = new TreeNode(2);
        // root.right.left = new TreeNode(2);
        // root.left.right.left = new TreeNode(1);
        // root.left.right.right = new TreeNode(6);
        // root.right.left.right = new TreeNode(8);
        // root.right.left.right.left = new TreeNode(1);
        // root.right.left.right.right = new TreeNode(3);

        // Checking if the linked list is a subpath in the binary tree
        // System.out.println(isSubPath(head, root));  // Output: true or false
    }
}
