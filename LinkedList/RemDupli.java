package LinkedList;

public class RemDupli {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 3};
        RemDupli list = new RemDupli();
        Node head = list.constructLL(values);

        System.out.print("Original Linked List: ");
        list.printLinkedList(head);

        GfG solution = new GfG();
        head = solution.removeDuplicates(head);

        System.out.print("Linked List after removing duplicates: ");
        list.printLinkedList(head);
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node constructLL(int[] values) {
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

    void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class GfG {
        Node removeDuplicates(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node current = head;
            while (current != null && current.next != null) {
                if (current.data == current.next.data) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    }
}
