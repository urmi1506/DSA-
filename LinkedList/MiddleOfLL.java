package LinkedList;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MiddleOfLL {
    public static ListNode middleNode(ListNode head) {
        // base case
        if(head == null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
    return  slow;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        ListNode temp=middleNode(head);
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
    }
}
