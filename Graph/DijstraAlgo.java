package Graph;
import java.util.*;
public class DijstraAlgo{

    public static int[] dijkstra(int V, ArrayList<int[]>[] adj, int S) {

        // Distance array
        int[] dist = new int[V];

        // Initially set all distances as infinity
        Arrays.fill(dist, Integer.MAX_VALUE);

        // Distance of source node is 0
        dist[S] = 0;

        // Priority Queue -> stores {distance, node}
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Add source node
        pq.add(new int[]{0, S});

        // Run until queue becomes empty
        while (!pq.isEmpty()) {

            // Get node with smallest distance
            int[] current = pq.poll();

            int currentDist = current[0];
            int currentNode = current[1];

            // Visit all neighbours
            for (int[] neighbour : adj[currentNode]) {

                int nextNode = neighbour[0];
                int weight = neighbour[1];

                // New shorter distance found
                if (currentDist + weight < dist[nextNode]) {

                    // Update distance
                    dist[nextNode] = currentDist + weight;

                    // Add updated node to queue
                    pq.add(new int[]{dist[nextNode], nextNode});
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {

        int V = 3; 
        int S = 2; 

        ArrayList<int[]>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        adj[0].add(new int[]{1, 1});
        adj[0].add(new int[]{2, 6});

        adj[1].add(new int[]{0, 1});
        adj[1].add(new int[]{2, 3});

        adj[2].add(new int[]{0, 6});
        adj[2].add(new int[]{1, 3});


        int[] ans = dijkstra(V, adj, S);

        System.out.println("Shortest distances from source:");

        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + " -> " + ans[i]);
        }
    }
}
