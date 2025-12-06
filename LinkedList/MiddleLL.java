package LinkedList;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleLL {
    public static ListNode middleNode(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode curr = head;

        // 1.store in temp arraylist
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }
        // 2.find middle
        int n = list.size();
        return list.get(n / 2);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode temp = middleNode(head);
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
    }
}
