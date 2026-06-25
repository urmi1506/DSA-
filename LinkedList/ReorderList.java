package LinkedList;

class Node{
    int val;
    ListNode next;

    public Node(int val){
        this.val = val;
        next = null;
    }
}
public class ReorderList {
    public static void reorderList(ListNode head) {
        // Edge case
        if(head == null || head.next == null) return;
        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode second = reverse(slow.next);
        slow.next = null;

        // merge 2 halves
        ListNode first = head;
        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
        private static ListNode reverse(ListNode head){
            ListNode prev = null;

            while(head != null){
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        reorderList(head);

        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
