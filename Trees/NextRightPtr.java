package Trees;

public class NextRightPtr {
    static class Node {
        int data;
        Node left, right;
        public Node next;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node connect(Node root) {
        Node curr = root;
        // traverse level-level
        while (curr != null) {
            Node dummy = new Node(0);
            // tail ---point to last node
            Node tail = dummy;

            // traverse within level
            while (curr != null) {

                // check left --not null--append it
                if (curr.left != null) {
                    tail.next = curr.left;
                    tail = tail.next;
                }
                // check right --not null--append it
                if (curr.right != null) {
                    tail.next = curr.right;
                    tail = tail.next;
                }
                curr = curr.next;
            }
            curr = dummy.next;
        }
        return root;
    }

    public static void printUsingNext(Node root) {
        Node levelStart = root;

        while (levelStart != null) {
            Node curr = levelStart;
            levelStart = null;

            while (curr != null) {
                System.out.print(curr.data + " -> ");

                if (levelStart == null) {
                    if (curr.left != null)
                        levelStart = curr.left;
                    else if (curr.right != null)
                        levelStart = curr.right;
                }
                curr = curr.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        connect(root);
        printUsingNext(root);
    }
}
