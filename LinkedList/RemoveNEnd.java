package LinkedList;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val ;
        this.next= null;
    }
}

public class RemoveNEnd {
  
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // create dummy node
        ListNode dummy = new ListNode (0);
        dummy.next=head;
        ListNode left = dummy ;
        ListNode right = head ;

        //right move n-steps
        while(n > 0 && right != null){
            right = right.next;
            n--;
        }

        //left and right move together
        while(right != null){
            left = left.next;
            right = right.next;
        }

        //remove left.next
        left.next = left.next.next;

    //return dummy.next
    return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = removeNthFromEnd(head, 2);

        while (res != null) {
            System.out.print(res.val +"--->");
            res=res.next;
        }
    }
}

