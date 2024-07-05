package LinkedList;

public class DelOccDLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;

        System.out.print("Original list: ");
        printList(head);

        head = Solution.deleteAllOccurOfX(head, 2);

        System.out.print("Modified list: ");
        printList(head);
    }

    static class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class Solution {
        static Node deleteAllOccurOfX(Node head, int x) {
            Node temp = new Node(0); 
            temp.next = head;
            if (head != null) head.prev = temp; 
            Node curr = head;
            Node prev = temp;

            while (curr != null) {
                if (curr.data == x) {
                    prev.next = curr.next;
                    if (curr.next != null) {
                        curr.next.prev = prev;
                    }
                    curr = prev.next;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            if (temp.next != null) temp.next.prev = null; 
            return temp.next;
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
