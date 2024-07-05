package LinkedList;

public class KEleLL {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        KEleLL list = new KEleLL();
        Node head = list.constructLL(values);

        Solution solution = new Solution();
        int n = 2;
        int result = solution.getNthFromLast(head, n);

        if (result == -1) {
            System.out.println("Invalid position. The linked list is too short.");
        } else {
            System.out.println("Value at position " + n + " from end: " + result);
        }
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

    static class Solution {
        int getNthFromLast(Node head, int n) {
            if (head == null || n <= 0) {
                return -1; 
            }

            Node slow = head;
            Node fast = head;

            for (int i = 0; i < n; i++) {
                if (fast == null) {
                    return -1; 
                }
                fast = fast.next;
            }

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow.data;
        }
    }
}
