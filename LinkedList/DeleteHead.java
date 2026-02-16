package LinkedList;

public class DeleteHead {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node deletehead(Node head){
        // Edge case
        if(head == null) return null;
        
        Node temp = head;
        head = temp.next ;
    
    return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        Node res = deletehead(head);
        while (res != null) {
            System.out.print(res.data +" ");
            res = res.next;
        }
    }
}
