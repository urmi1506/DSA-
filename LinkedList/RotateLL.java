package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

public class RotateLL {

    public static Node rotate(Node head, int k) {
        Node last=head;
        int nodes=0;
        
        while(last.next!=null)
        {
          last=last.next;
          nodes++;
        }
        nodes++;
        
        if(nodes==k)
            return head;
            
        while(k-->0)
        {
            last.next=head;
            last=last.next;
            head=head.next;
        }
        
        last.next=null;
        
        return head;
        
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(9);

        int k = 3;

        head = rotate(head, k);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
    }
  }
}
