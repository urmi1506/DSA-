package Graph;

import java.util.*;
import java.util.List;
public class HammingDist{
    public static int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {

        int n = source.length;

        // Build graph (who can swap with whom)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] swap : allowedSwaps) {
            int u = swap[0], v = swap[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int hamming = 0;

        // Find connected groups
        for (int i = 0; i < n; i++) {

            if (visited[i]) continue;

            // BFS to get one group
            Queue<Integer> q = new LinkedList<>();
            List<Integer> group = new ArrayList<>();

            q.add(i);
            visited[i] = true;

            while (!q.isEmpty()) {
                int node = q.poll();
                group.add(node);

                for (int nei : graph.get(node)) {
                    if (!visited[nei]) {
                        visited[nei] = true;
                        q.add(nei);
                    }
                }
            }

            // Count values in source
            Map<Integer, Integer> freq = new HashMap<>();
            for (int idx : group) {
                freq.put(source[idx], freq.getOrDefault(source[idx], 0) + 1);
            }

            // Match with target
            for (int idx : group) {
                int val = target[idx];

                if (freq.getOrDefault(val, 0) > 0) {
                    freq.put(val, freq.get(val) - 1); 
                } else {
                    hamming++; 
                }
            }
        }

        return hamming;
    }
    public static void main(String[] args) {
        int[] source = {1,2,3,4};
        int[] target = {2,1,4,5};
        int[][] allowedSwaps = {{0,1},{2,3}};

        int hammingDist = minimumHammingDistance(source, target, allowedSwaps);
        System.out.println(hammingDist);
    }
}