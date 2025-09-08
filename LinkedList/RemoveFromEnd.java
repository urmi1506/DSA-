package LinkedList;


public class RemoveFromEnd {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode removeFromNthNode(ListNode head ,int n){
        ListNode res=new ListNode(0,head);
        ListNode dummy=res;

        for(int i=0; i<n; i++){
            head=head.next;
        }

        while(head!=null){
            head=head.next;
            dummy=dummy.next;
        }

        dummy.next=dummy.next.next;
        return res.next;
    }
    public static void main(String[] args) {
        int n=2;
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);    
        head.next.next.next.next=new ListNode(5);
        ListNode res=removeFromNthNode(head,n);
        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
}
