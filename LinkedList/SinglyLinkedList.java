package LinkedList;

class SinglyLinkedList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    // 1. Traversal
    public void display() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 2. Insert At Beginning - Tc-O(1)
    public void insertAtBeginning(int val) {

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    // 3. Insert At End
    public void insertAtEnd(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // 4. Insert At Specific Position
    // Position starts from 1
    public void insertAtPosition(int val, int position) {

        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
            insertAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node current = head;

        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position Out Of Range");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // 5. Delete From Beginning -Tc-O(1)
    public void deleteBeginning() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    // 6. Delete From End
    public void deleteEnd() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // 7. Delete At Specific Position
    public void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
            deleteBeginning();
            return;
        }

        Node current = head;

        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Position Out Of Range");
            return;
        }

        current.next = current.next.next;
    }

    // 8. Search
    public boolean search(int key) {

        Node current = head;

        while (current != null) {

            if (current.val == key) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // 9. Update
    public void update(int oldValue, int newValue) {

        Node current = head;

        while (current != null) {

            if (current.val == oldValue) {
                current.val = newValue;
                return;
            }

            current = current.next;
        }

        System.out.println("Value Not Found");
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        // Insertions

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.insertAtPosition(25, 3);

        System.out.println("After Insertions:");
        list.display();

        // Search

        System.out.println("\nSearch 30 : "
                + list.search(30));

        System.out.println("Search 100 : "
                + list.search(100));

        // Update

        list.update(25, 26);

        System.out.println("\nAfter Update:");
        list.display();

        // Delete Beginning

        list.deleteBeginning();

        System.out.println("\nAfter Delete Beginning:");
        list.display();

        // Delete End

        list.deleteEnd();

        System.out.println("\nAfter Delete End:");
        list.display();

        // Delete Position
        list.deleteAtPosition(2);

        System.out.println("\nAfter Delete Position:");
        list.display();

    }
}

// all operation SC -0(1)
// insert & delete beginning tc -O(1) and remaining TC-O(n)