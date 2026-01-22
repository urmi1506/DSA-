package Graph;

import java.util.*;

public class BFS {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> traversal = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int size = adj.size();
        boolean[] visited = new boolean[size];

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int pop = q.poll();
            traversal.add(pop);

            for (int curr : adj.get(pop)) {
                if (!visited[curr]) { 
                    q.add(curr);
                    visited[curr] = true;
                }
            }
        }
        return traversal;
    }

    public static void main(String[] args) {
        int n = 5; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).addAll(Arrays.asList(2, 3, 1));
        adj.get(1).addAll(Arrays.asList(0));
        adj.get(2).addAll(Arrays.asList(0, 4));
        adj.get(3).addAll(Arrays.asList(0));
        adj.get(4).addAll(Arrays.asList(2));

        ArrayList<Integer> ans = bfs(adj);
        System.out.println(ans);
    }
}
