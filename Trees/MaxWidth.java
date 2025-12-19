package Trees;

import java.util.*;


class MaxWidth {
    static class Pair<K, V> {
        private K key;
        private V value;
    
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    
        public K getKey() {
            return key;
        }
    
        public V getValue() {
            return value;
        }
    }
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        public TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            int levelStart = queue.peek().getValue();
            int index = 0;

            for (int i = 0; i < levelLength; i++) {
                Pair<TreeNode, Integer> pair = queue.poll();
                TreeNode node = pair.getKey();
                index = pair.getValue();

                if (node.left != null) {
                    queue.add(new Pair<>(node.left, 2 * index));
                }

                if (node.right != null) {
                    queue.add(new Pair<>(node.right, 2 * index + 1));
                }
            }

            maxWidth = Math.max(maxWidth, index - levelStart + 1);
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        int maxWidth = widthOfBinaryTree(root);
        System.out.println(maxWidth);
    }
}
