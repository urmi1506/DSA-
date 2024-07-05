package LinkedList;

public class DelNodeSL {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        Node head = constructLL(values);
        
        GfG solution = new GfG();
        head = solution.deleteNode(head, 3); 
        
        printLinkedList(head);
    }

    static Node constructLL(int[] values) {
        if (values.length == 0) {
            return null;
        }
        Node head = new Node(values[0]);
        Node temp = head;

        for (int i = 1; i < values.length; i++) {
            temp.next = new Node(values[i]);
            temp = temp.next;
        }

        return head;
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class GfG {
        Node deleteNode(Node head, int x) {
            if (head == null) {
                return null; 
            }
            
            if (x == 1) {
                return head.next; 
            }
            
            Node temp = head;
            for (int i = 1; temp != null && i < x - 1; i++) {
                temp = temp.next;
            }
            
            if (temp == null || temp.next == null) {
                return head; 
            }
            
            temp.next = temp.next.next;
            return head;
        }
    }
}
