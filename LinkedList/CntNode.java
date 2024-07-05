package LinkedList;

public class CntNode {
    public static void main(String[] args) {
       
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Solution solution = new Solution();
        int count = solution.getCount(head);
        System.out.println("Number of nodes: " + count);
    }

    static class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    static class Solution {
        public int getCount(Node head) {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }
}
