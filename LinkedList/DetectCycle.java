package LinkedList;

import java.util.HashSet;
class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            data=this.data;
            next=null;
        }
    }
public class DetectCycle {
    
    public static boolean hasCycle(ListNode head){
          HashSet<ListNode>set=new HashSet<>();
        while(head != null){
            if(set.contains(head)) return true;
            set.add(head);
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));
    }

}
