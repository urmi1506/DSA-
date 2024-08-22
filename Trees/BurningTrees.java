package Trees;
import java.util.*;

    class Node {
        int data;
        Node left, right;
        
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    
    public class BurningTrees {
        static Map<Integer, List<Integer>> adjList = new HashMap<>();
         Node targetNode = null;
    
        public static int minTime(Node root, int target) {
            // Step 1: Build adjacency list from the binary tree
            buildAdjList(root, null);
            
            // Step 2: Calculate time to spread fire from the target node
            return calculateTime(target);
        }
    
        public static int calculateTime(int target) {
            int time = 0;
            
            // Initialize BFS structures
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();
            
            // Start BFS from target node
            queue.add(target);
            visited.add(target);
            
            // Process nodes level by level
            while (!queue.isEmpty()) {
                int size = queue.size();  // Number of nodes at current level
                
                for (int i = 0; i < size; i++) {
                    int current = queue.poll();  // Get node from queue
                    
                    // Add unvisited neighbors to the queue
                    for (int neighbor : adjList.get(current)) {
                        if (visited.contains(neighbor)) {
                            continue;
                        }
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
                time++;  // Increment time after processing one level
            }
            
            return time - 1;  // Adjust time to account for the last level
        }
    
        public static void buildAdjList(Node root, Node parent) {
            if (root == null) {
                return;  // Base case: Null node
            }
            
            // Create adjacency list entry for current node
            adjList.put(root.data, new ArrayList<>());
            
            // Add connection between parent and current node
            if (parent != null) {
                adjList.get(parent.data).add(root.data);
                adjList.get(root.data).add(parent.data);
            }
            
            // Recursively build adjacency list for left and right children
            buildAdjList(root.left, root);
            buildAdjList(root.right, root);
        }
    
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right = new Node(6);
    
            int target = 5;
            System.out.println(minTime(root, target));  
        }
    }
    
