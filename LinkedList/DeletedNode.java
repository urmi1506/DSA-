package LinkedList;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        next = null;
    }
}

public class DeletedNode {
    
    public static void deleteNode(ListNode node){
        //copy nextnode val
        node.val = node.next.val;
        //remove node
        node.next=node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        deleteNode(head.next);

        while(head != null){
            System.out.print(" " + head.val);
            head =head.next;
        }

    }
}
