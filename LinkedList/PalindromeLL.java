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
        List<Integer> arr = new ArrayList<>();

        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            if (!arr.get(left).equals(arr.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;        
    }
}
