package LinkedList;

public class RemDupliDLL {
    public static void main(String[] args) {
        RemDupliDLL list = new RemDupliDLL();

        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.prev = head;
        head.next.next = list.new Node(2);
        head.next.next.prev = head.next;
        head.next.next.next = list.new Node(3);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = list.new Node(3);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.print("Original list: ");
        printList(head);

        Solution solution = list.new Solution();
        head = solution.removeDuplicates(head);

        System.out.print("List after removing duplicates: ");
        printList(head);
    }

    class Node {
        int data;
        Node next, prev;
        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }

    class Solution {
        Node removeDuplicates(Node head) {
            Node temp = head.next;

            while (temp != null) {
                if (temp.prev.data == temp.data) {
                    Node prev = temp.prev;
                    prev.next = temp.next;

                    if (temp.next != null) {
                        temp.next.prev = prev;
                    }
                    temp = prev.next;
                } else {
                    temp = temp.next;
                }
            }
            return head;
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
