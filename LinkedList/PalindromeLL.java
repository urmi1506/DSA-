package LinkedList;

import java.util.ArrayList;
import java.util.List;

class ListNode {
        int val;
        ListNode next, prev;
        ListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

public class PalindromeLL {
     public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        // Traverse LinkedList
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        // Check for palindrome
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;        
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head)); 
    }
}
