package LinkedList;
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MiddleLinkedList {
    public static ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode curr=head;
        // count nodes
        while(curr!= null) {
            cnt++;
            curr=curr.next;
        }
        // move to middle
        int mid=cnt/2;
        curr=head;
        for(int i=0; i<mid; i++){
            curr=curr.next;
        }
    return curr;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode temp=middleNode(head);
        while(temp != null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
    }
}
