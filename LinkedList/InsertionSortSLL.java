package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

public class InsertionSortSLL {
    public static void main(String[] args) {
        int[] values = {3, 1, 5, 2, 4};
        Node head = constructLL(values);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        head = insertionSort(head);

        System.out.print("Sorted Linked List: ");
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

        static Node insertionSort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            ArrayList<Integer> arr = new ArrayList<>();
            Node temp = head;
            while (temp != null) {
                arr.add(temp.data);
                temp = temp.next;
            }

            Collections.sort(arr);

            temp = head;
            for (int i = 0; i < arr.size(); i++) {
                temp.data = arr.get(i);
                temp = temp.next;
            }

            return head;
        }
    
}
