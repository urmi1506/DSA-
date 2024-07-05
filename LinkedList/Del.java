package LinkedList;

public class Del {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        Del list = new Del();
        Node head = list.constructLL(values);

        System.out.print("Original Linked List: ");
        list.printLinkedList(head);

        Node nodeToDelete = head.next.next; 
        Solution solution = new Solution();
        solution.deleteNode(nodeToDelete);

        System.out.print("Linked List after deletion: ");
        list.printLinkedList(head);
    }

    static class Node {
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

    static class Solution {
        void deleteNode(Node del_node) {
            if (del_node == null || del_node.next == null) {
                return;
            }
            del_node.data = del_node.next.data;
            del_node.next = del_node.next.next;
        }
    }
}
