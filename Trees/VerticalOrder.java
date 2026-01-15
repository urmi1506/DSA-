package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrder {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Pair {
        TreeNode node;
        int vertical;
        int level;

        Pair(TreeNode n, int v, int l) {
            node = n;
            vertical = v;
            level = l;
        }
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        // Map to store vertical and level mapping
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        // Queue for BFS storing node with vertical and level
        Queue<Pair> q = new LinkedList<>();

        // Push root node with coordinates (0,0)
        q.offer(new Pair(root, 0, 0));

        // Perform BFS
        while (!q.isEmpty()) {
            Pair p = q.poll();
            TreeNode temp = p.node;
            int v = p.vertical;
            int l = p.level;

            // Add node value to map
            map.putIfAbsent(v, new TreeMap<>());
            map.get(v).putIfAbsent(l, new PriorityQueue<>());
            map.get(v).get(l).offer(temp.data);

            // If left child exists, push to queue
            if (temp.left != null) {
                q.offer(new Pair(temp.left, v - 1, l + 1));
            }

            // If right child exists, push to queue
            if (temp.right != null) {
                q.offer(new Pair(temp.right, v + 1, l + 1));
            }
        }

        // Final answer
        List<List<Integer>> ans = new ArrayList<>();

        // Iterate through map to build result
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> pq : ys.values()) {
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            ans.add(col);
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right.right = new TreeNode(6);

        List<List<Integer>> res = verticalTraversal(root);
        System.out.println(res);
    }
}
