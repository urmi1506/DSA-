package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindPath {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize list for every node
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges in graph
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // Queue --> Level order traversal
        Queue<Integer> queue = new LinkedList<>();

        // boolean array -- > store visited node
        boolean[] visited = new boolean[n];

        // add src in queue & mark as true
        queue.add(source);
        visited[source] = true;

        // Traverse upto queue not empty
        while(!queue.isEmpty()) {

            // Remove current node
            int node = queue.poll();

            // check destination found
            if(node == destination)
                return true;

            // check neighbors --> if unvisited -add to queue & mark as visited
            for(int current : adj.get(node)) {

                if(!visited[current]) {
                    queue.add(current);
                    visited[current] = true;
                }
            }
        }

        // Destination not found
        return false;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;

        boolean findValidPath = validPath(n, edges, source, destination);
        System.out.println(findValidPath);
    }
}
