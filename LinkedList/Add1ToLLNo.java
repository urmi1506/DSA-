package LinkedList;

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
public class Add1ToLLNo {
    public static Node addOne(Node head) {
        if(head.next == null){  
            head.data+= 1; 
		    return head;
	    }
	    Node sum = addOne(head.next);   
	    head.data+= (sum.data/10);   
	    sum.data = sum.data%10;  
	    return head;   
    }
    public static void printList(Node head) {
      
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.print("Original list: ");
        printList(head);

        head = addOne(head);

        System.out.print("After adding 1: ");
        printList(head);
    }
}
