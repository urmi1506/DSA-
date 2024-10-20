package LinkedList;

// Node class for Doubly Linked List
class DLLNode {
    int data;
    DLLNode prev, next;

    public DLLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class SortedDLL {

    // Function to sort a k-sorted Doubly Linked List
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Selection sort for k-sorted doubly linked list
        DLLNode temp = head;
        while (temp != null) {
            int i = 0;
            DLLNode temp2 = temp.next;
            DLLNode min = temp;
            while (i < k && temp2 != null) {
                if (temp2.data < min.data) {
                    min = temp2;
                }
                temp2 = temp2.next;
                i++;
            }
            // Swap the data values
            int val = temp.data;
            temp.data = min.data;
            min.data = val;

            temp = temp.next;
        }
        return head;
    }

    // Function to append a node at the end of the list
    public DLLNode append(DLLNode head, int data) {
        DLLNode newNode = new DLLNode(data);

        // If the list is empty, the new node becomes the head
        if (head == null) {
            return newNode;
        }

        DLLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the new node
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    // Function to display the doubly linked list
    public void display(DLLNode head) {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedDLL sortedDLL = new SortedDLL();

        // Create a k-sorted doubly linked list: 3 <-> 2 <-> 1 <-> 5 <-> 6 <-> 4
        DLLNode head = null;
        head = sortedDLL.append(head, 3);
        head = sortedDLL.append(head, 2);
        head = sortedDLL.append(head, 1);
        head = sortedDLL.append(head, 5);
        head = sortedDLL.append(head, 6);
        head = sortedDLL.append(head, 4);

        System.out.println("Original k-sorted list:");
        sortedDLL.display(head);

        // Sort the k-sorted doubly linked list with k = 2
        head = sortedDLL.sortAKSortedDLL(head, 2);

        System.out.println("Sorted list:");
        sortedDLL.display(head);
    }
}
