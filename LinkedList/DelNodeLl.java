package LinkedList;

public class DelNodeLl {
    public static void main(String[] args) {
    
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        DelNodeLl solution = new DelNodeLl();
        solution.deleteNode(head.next.next);

        System.out.print("Linked List after deletion: ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; 
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
