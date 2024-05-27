import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);

    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Solution {
        // Function to insert a node at the beginning of the linked list.
        Node insertAtBeginning(Node head, int x) {
            Node new_node = new Node(x);

            new_node.next = head;

            head = new_node;

            return head; // Added return statement
        }

        // Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x) {
            Node new_node = new Node(x);

            if (head == null) {
                head = new Node(x);
                return head;
            }

            new_node.next = null;

            Node last = head;
            while (last.next != null)
                last = last.next;

            last.next = new_node;
            return head; // Added return statement
        }
    }
}
