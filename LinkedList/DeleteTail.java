package LinkedList;

public class DeleteTail {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node deletetail(Node head){
        // Edge case
        if(head == null || head.next == null) return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        // assign null pointer new tail
        temp.next = null;
    return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        Node res = deletetail(head);
        while (res != null) {
            System.out.print(res.data +" ");
            res = res.next;
        }
    }
}
