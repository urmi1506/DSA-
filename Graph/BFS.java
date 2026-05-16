package Graph;
import java.util.*;

// TC - O(V+E) ,SC -O(V)
public class BFS {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        int size = adj.size();
        // initialized arraylist --> store final traversal
        ArrayList<Integer> bfs = new ArrayList<>();
        // initialized queue ---> Level wise traversal
        Queue<Integer> queue =  new LinkedList<>();
        // initialized boolean array --> store visisted node
        boolean visited[] = new boolean[size];
        
        // add initial node & mark it visited
        queue.add(0);
        visited[0] = true;
        
        // Traverse ---upto queue not empty
        while(!queue.isEmpty()){
            // remove node
            int node = queue.poll();
            // add to final traversal
            bfs.add(node);
            
            // check neighbours --> not visited then add to queue mark it visited
            for(int current : adj.get(node)){
                if(!visited[current]){
                    queue.add(current);
                    visited[current]=true;
                }
            }
            
        }
    return bfs;   
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
