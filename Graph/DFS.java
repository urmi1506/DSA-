package Graph;
import java.util.*;

public class DFS {
    
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int size = adj.size();
        // initialized arraylist ---> store dfs traversal
        ArrayList<Integer> dfs = new ArrayList<>();
        // initialized boolean array --> store visisted node
        boolean[] visited = new boolean[size];
        // traverse dfs recursively
        dfsRecursive(adj , 0, visited ,dfs);
        
    return dfs;
    }
    private static void dfsRecursive(ArrayList<ArrayList<Integer>> adj , int node 
    ,boolean []visited ,ArrayList<Integer>dfs){
        // viisted node ,mark as true & add to dfs
        visited[node]= true;
        dfs.add(node);
        
        // check neighbour --> if not visited --traverse dfs Recursively
        for(int current : adj.get(node)){
            if(!visited[current]){
                dfsRecursive(adj ,current ,visited ,dfs);
            }
        }
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

        ArrayList<Integer> res = dfs(adj);
        System.out.println(res);
    }
}
