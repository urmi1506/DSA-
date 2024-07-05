package LinkedList;

public class DetectLoop {
    public static void main(String[] args) {
        DetectLoop list = new DetectLoop();
        Node head = list.createLinkedListWithLoop();

        Solution solution = new Solution();
        boolean hasLoop = solution.detectLoop(head);

        if (hasLoop) {
            System.out.println("Linked list has a loop.");
        } else {
            System.out.println("Linked list does not have a loop.");
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

    Node createLinkedListWithLoop() {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        return head;
    }

    static class Solution {
        boolean detectLoop(Node head) {
            if (head == null || head.next == null) {
                return false; 
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;       
                fast = fast.next.next;  

                if (slow == fast) {
                    return true; 
                }
            }

            return false; 
        }
    }
}
