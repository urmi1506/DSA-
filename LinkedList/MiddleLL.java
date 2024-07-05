package LinkedList;

public class MiddleLL {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        MiddleLL list = new MiddleLL();
        Node head = list.constructLL(values);
        
        Solution solution = list.new Solution();
        int middleValue = solution.getMiddle(head);
        
        System.out.println("Middle element: " + middleValue);
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

    class Solution {
        int getMiddle(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    }
}
