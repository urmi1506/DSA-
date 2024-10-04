package LinkedList;

public class DelRev {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
        // Function to reverse a circular linked list
        static Node reverse(Node head) {
            if (head == null || head.next == head) return head; // No need to reverse if empty or single node.
    
            Node prev = null;
            Node current = head;
            Node next = null;
            Node tail = head;
    
            // Traverse and reverse the list
            do {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            } while (current != head);
    
            // Fix head and tail
            head.next = prev;
            head = prev;
    
            return head;
        }
    
        // Function to delete a node from the circular linked list
        static Node deleteNode(Node head, int key) {
            if (head == null) return null;
    
            Node current = head, prev = null;
    
            // Case when the head node itself contains the key
            if (head.data == key) {
                // If head is the only node
                if (head.next == head) return null;
    
                // Find the last node to update its `next` pointer
                Node last = head;
                while (last.next != head) {
                    last = last.next;
                }
    
                // Remove head node
                head = head.next;
                last.next = head;
                return head;
            }
    
            // Traverse the list to find the key and remove the node
            do {
                prev = current;
                current = current.next;
            } while (current != head && current.data != key);
    
            // Key not found
            if (current == head) return head;
    
            // Remove the node
            prev.next = current.next;
            return head;
        }
    
        // Utility function to print the circular linked list
       static void printList(Node head) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
    
            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD");
        }
    
        // Utility function to create a circular linked list from an array
       static Node createCircularList(int[] arr) {
            if (arr.length == 0) return null;
    
            Node head = new Node(arr[0]);
            Node tail = head;
    
            for (int i = 1; i < arr.length; i++) {
                tail.next = new Node(arr[i]);
                tail = tail.next;
            }
    
            tail.next = head; // Make it circular
            return head;
        }
    
        public static void main(String[] args) {
           
    
            // Create a circular linked list with given elements
            int[] elements = {2, 5, 7, 8, 10};
            Node head = createCircularList(elements);
    
            // Print the original list
            System.out.println("Original Circular Linked List:");
           printList(head);
    
            // Delete node with value 8
            head = deleteNode(head, 8);
            System.out.println("\nList after deleting node with value 8:");
            printList(head);
    
            // Reverse the circular linked list
            head = reverse(head);
            System.out.println("\nReversed Circular Linked List:");
            printList(head);
        }
    }
    

