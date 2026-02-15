package LinkedList;

public class SearchLL {
    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int key = 3;
        boolean found = searchKey(head, key);

        if (found) {
            System.out.println("Key " + key + " found in the linked list.");
        } else {
            System.out.println("Key " + key + " not found in the linked list.");
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

        static boolean searchKey(Node head, int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

