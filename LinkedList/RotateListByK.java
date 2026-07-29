package LinkedList;


public class RotateListByK {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        // Edge case
        if(head == null || head.next ==null || k==0) return head;

        // check length and tail
        int len =1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        // to efficienty rotate 
        k %= len;
        
        // make circular list -->easy for rotation
        tail.next = head;

        // rotate by k
        int steps = len - k;
        ListNode newtail = head;
        for(int i=1; i<steps; i++){
            newtail = newtail.next;
        }

        ListNode newHead = newtail.next;
        newtail.next = null;

    return newHead;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(9);

        int k=2;

        head = rotateRight(head, k);

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
