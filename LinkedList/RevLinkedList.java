package LinkedList;

public class RevLinkedList {
    public static void main(String[] args) {
        int[] values = {10};
        Node head = constructLL(values);
        Solution solution = new Solution();
        Node reversedHead = solution.reverseList(head);
        printLinkedList(reversedHead);
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

    static class Solution {
        Node reverseList(Node head) {
            Node current = head;
            Node previous = null;

            while (current != null) {
                Node next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            return previous;
        }
    }
}
