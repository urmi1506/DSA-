package LinkedList;

import java.util.ArrayList;
import java.util.List;


public class RemoveEnd {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; this.next = null; 
        }
      }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //store node in list
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp);
            temp=head.next;
        }

        //Find idx to remove
        int size = list.size();
        int idxRemove = size - n ;

        //Handle head removal
        if(idxRemove == 0) return head.next;

        //Remove node by connecting prev one
        ListNode prev = list.get(idxRemove - 1);
        prev.next = (idxRemove +1 < size) ? list.get(idxRemove + 1) : null;
        
    //return updated head
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
