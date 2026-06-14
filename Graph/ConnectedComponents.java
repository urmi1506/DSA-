package Graph;

import java.util.List;
import java.util.*;


public class ConnectedComponents{
    public static int countComponents(int n, int[][] edges) {
        // Track visited node
        boolean[] visited = new boolean[n];
        // create adj list
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        // Build Graph
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(b).add(a);
            adj.get(a).add(b);
        }
         
        int count = 0;
        // Traverse & check unvisited node -->perform BFS
        for(int i=0; i<n; i++){
                if(!visited[i]){
                    bfs(i ,adj ,visited);
                    count++;
                }
            }
        return count;
        } 
    
    private static void bfs(int start , List<List<Integer>>adj ,boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        // add starting node in queue & mark is visited
        queue.offer(start );
        visited[start] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();

            // Explore neighbour & check unvisited node 
            for(int nei : adj.get(node)){
                if(!visited[nei]){
                    visited[nei] = true;
                    queue.offer(nei);
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0,1},{1,2},{3,4}};

        int result = countComponents(n, edges);
        System.out.println(result);
    }
}