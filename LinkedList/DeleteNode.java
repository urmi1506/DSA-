package LinkedList;

import java.util.List;

public class DeleteNode {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next=null;
        }
    }
    public static void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        head.next=new ListNode(5);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(9);
        deleteNode(head.next);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
