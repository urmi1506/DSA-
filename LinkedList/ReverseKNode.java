package LinkedList;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val= val;
        this.next = null;
    }

}
public class ReverseKNode{
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)
           return null;

        // check list is in range of k
        ListNode tail = head;
        for(int i=0; i<k; i++){
            if(tail == null)
               return head;

            tail = tail.next;
        }

        // Reverse first k elements
        ListNode newHead = reverse(head ,tail);

        // reverse rest 
        head.next = reverseKGroup(tail ,k);

    return newHead;
    }

    private static ListNode reverse(ListNode curr ,ListNode end){
        ListNode prev = null;

        while(curr != end){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }

    return prev;
    }
    static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNode  head =new ListNode(1);
        head.next = new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next= new ListNode(5);
        
        int k=2;
        ListNode reverse = reverseKGroup(head ,k);

        printLinkedList(reverse);

    }
    

}