package Trees;

import java.util.ArrayList;
import java.util.List;

public class MaxKDivComp {
     public static int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int[] i : edges) {
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        int[] ans = new int[1];
        dfs(adj,values,0,-1,ans,k);
        return ans[0];
    }
    static int dfs(List<List<Integer>> adj, int[] values, int node, int parent, int[] ans, int k) {
        int sum = values[node];
        for(int temp : adj.get(node)) {
            if(temp != parent) {
                sum += dfs(adj,values,temp,node,ans,k);
            }
        }
        if(sum % k == 0) ans[0]++;
        return sum % k;
    }
    public static void main(String[] args) {
       int n = 5,  k = 6;
       int [][]edges = {{0,2},{1,2},{1,3},{2,4}};
      int []values = {1,8,1,4,4};
      System.out.println(maxKDivisibleComponents( n,edges,values,k) );
    }
}