package LinkedList;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class SplitLL {

    Node[] alternatingSplitList(Node head) {
        if (head == null) {
            return new Node[]{null, null};
        }

        Node[] res = new Node[2];
        res[0] = head; 
        res[1] = head.next; 

        Node firstList = res[0]; 
        Node secondList = res[1]; 

        while (firstList != null && secondList != null) {
            firstList.next = secondList.next; // Set the next of first list node
            firstList = firstList.next; // Move to the next node of the first list

            secondList.next = firstList != null ? firstList.next : null; // Set the next of second list node
            secondList = secondList.next; // Move to the next node of the second list
        }

        return res;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        SplitLL splitter = new SplitLL();
        Node[] result = splitter.alternatingSplitList(head);

        System.out.print("First List: ");
        printList(result[0]);
        System.out.print("Second List: ");
        printList(result[1]);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
