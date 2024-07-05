package LinkedList;

public class InsertionDLL {
    public static void main(String[] args) {
       
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node4 = new Node(4);

        head.next = node2;
        node2.prev = head;
        node2.next = node4;
        node4.prev = node2;

        GfG solution = new GfG();
        solution.addNode(head, 2, 3);

        System.out.print("Doubly Linked List after insertion: ");
        printLinkedList(head);
    }

    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    static class GfG {
        void addNode(Node head_ref, int pos, int data) {
            Node newNode = new Node(data);
            Node temp = head_ref;
            int count = 1;

            while (temp != null && count < pos) {
                temp = temp.next;
                count++;
            }

            if (temp == null) {
                System.out.println("Position " + pos + " out of bounds.");
                return;
            }

            newNode.prev = temp;
            newNode.next = temp.next;

            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
        }
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
