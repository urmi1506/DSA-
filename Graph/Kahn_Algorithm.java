package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Kahn_Algorithm{
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the graph
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }
        // Step 1: Calculate indegree of each node
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        // Step 2: Add all nodes with indegree 0 to queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        
         // Step 3: Perform BFS
        ArrayList<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);

            // Reduce indegree of adjacent nodes
            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        return topo;
    }
    public static void main(String[] args) {
        int V = 4, E = 3;
        int edges[][] = {{3, 0}, {1, 0}, {2, 0}};

        ArrayList<Integer>res = topoSort(V, edges);
        System.out.println(res);
        
    }
}
