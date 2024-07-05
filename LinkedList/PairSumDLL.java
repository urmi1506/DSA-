package LinkedList;

import java.util.ArrayList;

public class PairSumDLL {
    public static void main(String[] args) {
        PairSumDLL list = new PairSumDLL();
        
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.prev = head;
        head.next.next = list.new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = list.new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = list.new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        int target = 5;
        ArrayList<ArrayList<Integer>> pairs = Solution.findPairsWithGivenSum(target, head);

        System.out.println("Pairs with sum " + target + ":");
        for (ArrayList<Integer> pair : pairs) {
            System.out.println(pair.get(0) + ", " + pair.get(1));
        }
    }

    class Node {
        int data;
        Node next, prev;
        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }

    static class Solution {
        public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            Node left = head;
            
            Node right = head;
            while (right.next != null) {
                right = right.next;
            }

            while (left != null && right != null && left != right && left.prev != right) {
                int sum = left.data + right.data;
                if (sum == target) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(left.data);
                    pair.add(right.data);
                    list.add(pair);
                    
                    left = left.next;
                    right = right.prev;
                } else if (sum > target) {
                    right = right.prev;
                } else {
                    left = left.next;
                }
            }
            return list;
        }
    }
}
