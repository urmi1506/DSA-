package Graph;

import java.util.List;
import java.util.*;

public class NwDelay {
    public static int networkDelayTime(int[][] times, int n, int k) {
        // create adjacency list -->store graph node
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        // add edges to graph
        for(int[]edge :times){
            // src node
            int u = edge[0];
            // target node 
            int v = edge[1];
            // wt
            int wt = edge[2];
            // directed graph
            adj.get(u).add(new int[] {v ,wt});
        }

        // dist arr -->store dist
        int[] dist = new int [n+1];
        // fill arr with infinity 
        Arrays.fill(dist ,Integer.MAX_VALUE); 
         // Source has distance zero
        dist[k] = 0;
        // min-heap -->want shortest path
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] -b[0]);
        // add src node to [-pq]
        pq.offer(new int[] {0 ,k});

        // run until pq is empty
        while(!pq.isEmpty()){
            // remove currNode
            int []curr = pq.poll();
            int currDist = curr[0];
            int currNode = curr[1];
            
            // skip if already found shortest path
            if(currDist > dist[currNode]) 
               continue;

            // explore all neighbors
            for(int []nei : adj.get(currNode)){
                int nextNode = nei[0];
                int weight = nei[1];

                // check new shortest dist
                if(currDist + weight < dist[nextNode]){
                    // update
                    dist[nextNode] = currDist + weight;
                    // add  updated Node to pq
                    pq.offer(new int[] {dist[nextNode] ,nextNode});
                }
            }

        }
        int res =0;
        for(int i=1; i<=n; i++){
            if(dist[i]== Integer.MAX_VALUE )
               return -1;

            res =Math.max(res ,dist[i]);
        }
    return res;
    }
    public static void main(String[] args) {
        int [][]times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;
        System.out.println(networkDelayTime(times ,n ,k));
    }
}
