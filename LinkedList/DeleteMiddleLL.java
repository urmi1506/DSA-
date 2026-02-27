package LinkedList;

public class DeleteMiddleLL {
    static class Node {
          int data;
          Node next;
          Node(int data) 
          { this.data = data; 
            next = null; }
      }

     static Node deleteMid(Node head) {
        
        // edge case 
        if(head == null || head.next == null) return null;
        
        Node slow = head ;
        Node fast = head ;
        Node prev = null ;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        // delete middle 
        prev.next = slow.next;

    return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node temp=deleteMid(head);
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
}
