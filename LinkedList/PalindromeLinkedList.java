package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    // Reverse linked list
    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find the middle (slow will be at mid)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode second = reverse(slow);

        // Compare halves
        ListNode first = head;
        ListNode secondCopy = second; 
        boolean isPalin = true;

        while (second != null) {
            if (first.val != second.val) {
                isPalin = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        reverse(secondCopy);

        return isPalin;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        boolean result = isPalindrome(head);
        System.out.println("Is Palindrome? " + result);

        System.out.print("List: ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
