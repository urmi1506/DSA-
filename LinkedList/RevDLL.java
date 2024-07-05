package LinkedList;

public class RevDLL {
    public static void main(String[] args) {
        RevDLL list = new RevDLL();
        
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.prev = head;
        head.next.next = list.new Node(3);
        head.next.next.prev = head.next;
        
        System.out.print("Original list: ");
        list.printList(head);
        
        head = reverseDLL(head);
        
        System.out.print("Reversed list: ");
        list.printList(head);
    }
    
    class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node reverseDLL(Node head) {
        Node curr = head;
        
        while (curr != null) {
            Node temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            
            head = curr;
            
            curr = curr.prev; 
        }
        
        return head; 
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
