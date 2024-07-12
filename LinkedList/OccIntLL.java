package LinkedList;

public class OccIntLL {
    public static void main(String[] args) {
        int[] values = {1, 2, 1, 2, 1, 3, 1};
        int key = 1;

        OccIntLL list = new OccIntLL();
        Node head = list.constructLL(values);

        int occurrences = Solution.count(head, key);

        System.out.println("Number of occurrences of " + key + ": " + occurrences);
    }

    static class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
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
        public static int count(Node head, int key) {
            int cnt = 0;
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    cnt++;
                }
                temp = temp.next;
            }
            return cnt;
        }
    }
}
