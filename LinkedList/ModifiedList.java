package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class ModifiedList {
    static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public static ListNode modifiedList(int[] nums, ListNode head) {
        // Convert the array to a HashSet for quick lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // handle edge cases, such as removing head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy; 
        ListNode curr = head; 
        while (curr != null) {
            if (numSet.contains(curr.val)) {
                // Delete current node 
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            // Move to  next node
            curr = curr.next;
        }

        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode ans=modifiedList(nums, head);
        printList(ans);

    }
}


