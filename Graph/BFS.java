package Graph;
import java.util.*;

public class BFS {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // store final ans
        ArrayList<Integer> res = new ArrayList<>();
        // traverse levelwise
        Queue<Integer> q = new LinkedList<>();
        int size = adj.size();
        // store visited node
        boolean[] visited = new boolean[size];
        
        // add initial node & mark it visited
        q.add(0);
        visited[0] = true;
        
        // Traverse 
        while (!q.isEmpty()) {
            // pop node
            int node = q.poll();
            // add to final res
            res.add(node);
            
            // check neighbours
            for (int curr : adj.get(node)) {
                // not visited ..add to queue & mark it visited
                if (!visited[curr]) { 
                    q.add(curr);
                    visited[curr] = true;
                }
            }
        }
        return res;
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
