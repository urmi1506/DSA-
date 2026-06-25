package LinkedList;

public class RemoveEnd {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; this.next = null; 
        }
      }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Edge case
        if (head == null ) return null;
        
        // cal length of whole linkedlist
        int size = 0;        
        ListNode temp = head;
        while(temp != null){
            size++;
            temp=temp.next;
        }

        if(size == n){
            return head.next;
        }

        // traverse upto m
        int m = size - n;
        ListNode curr = head;
        for(int i=1; i<m; i++){
           curr = curr.next;
        }
        // remove node
        curr.next= curr.next.next;

    return head;
    }
    public static void main(String[] args) {
        int n=2;
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);    
        head.next.next.next.next=new ListNode(5);

        ListNode res=removeNthFromEnd(head,n);

        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }

}
