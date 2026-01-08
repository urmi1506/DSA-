package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointer {
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
        if (root == null)
            return null;
        // initialize queue
        Queue<Node> q = new LinkedList<>();
        // add root
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;
            for (int i = 0; i < size; i++) {
                // pop node
                Node parent = q.poll();

                if (prev != null)
                    prev.next = parent;

                prev = parent;

                // check parent left & right
                if (parent.left != null)
                    q.offer(parent.left);
                if (parent.right != null)
                    q.offer(parent.right);

            }
            prev.next = null;
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
