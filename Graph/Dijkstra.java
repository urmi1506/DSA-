package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.List;

public class Dijkstra {
    public static int[] dijkstra(int V, int[][] edges, int src) {
        // code here

        // adj[] --> store graph
        List<List<int[]>> adj = new ArrayList<>();

        // initialize adj list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // add edges to graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj.get(u).add(new int[] { v, wt });
            adj.get(v).add(new int[] { u, wt });
        }

        // dist[] -->store dist
        int[] dist = new int[V];

        // fill array with infinity dist
        Arrays.fill(dist, Integer.MAX_VALUE);

        // src --> zero dist
        dist[src] = 0;

        // pq --> min heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // add src to pq
        pq.add(new int[] { 0, src });

        // run upto pq became empty
        while (!pq.isEmpty()) {

            // remove currNode --> shortest dist node
            int[] curr = pq.poll();

            int currDist = curr[0];
            int currNode = curr[1];

            // skip if already found shorter path
            if (currDist > dist[currNode]) {
                continue;
            }

            // check neighbours
            for (int[] neighbour : adj.get(currNode)) {

                int nextNode = neighbour[0];
                int weight = neighbour[1];

                // check new shortest dist
                if (currDist + weight < dist[nextNode]) {

                    dist[nextNode] = currDist + weight;

                    // add node to pq
                    pq.add(new int[] { dist[nextNode], nextNode });
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {

        int V = 3;

        int[][] edges = {
                { 0, 1, 1 },
                { 1, 2, 3 },
                { 0, 2, 6 }
        };

        int src = 2;

        int[] ans = dijkstra(V, edges, src);

        System.out.println(Arrays.toString(ans));
    }
}
