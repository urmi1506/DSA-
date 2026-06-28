package Graph;

import java.util.*;
import java.util.List;

public class AlienDict {
        // Kahn's BFS Topological Sort
        private static List<Integer> topoSort(int V, List<List<Integer>> adj) {

            int[] indegree = new int[V];

            // build indegree
            for (int i = 0; i < V; i++) {
                for (int v : adj.get(i)) {
                    indegree[v]++;
                }
            }

            Queue<Integer> q = new LinkedList<>();

            // push all 0 indegree nodes
            for (int i = 0; i < V; i++) {
                if (indegree[i] == 0)
                    q.add(i);
            }

            List<Integer> res = new ArrayList<>();

            // BFS
            while (!q.isEmpty()) {
                int u = q.poll();
                res.add(u);

                for (int v : adj.get(u)) {
                    indegree[v]--;
                    if (indegree[v] == 0)
                        q.add(v);
                }
            }

            return res;
        }

        public static String findOrder(String[] words) {

            int V = 26;

            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());

            boolean[] present = new boolean[V];

            // mark used chars
            for (String w : words) {
                for (char c : w.toCharArray()) {
                    present[c - 'a'] = true;
                }
            }

            // build graph from adjacent words
            for (int i = 0; i < words.length - 1; i++) {

                String a = words[i], b = words[i + 1];

                // invalid prefix case
                if (a.length() > b.length() && a.startsWith(b))
                    return "";

                int len = Math.min(a.length(), b.length());

                // first mismatch gives order
                for (int j = 0; j < len; j++) {
                    if (a.charAt(j) != b.charAt(j)) {
                        int u = a.charAt(j) - 'a';
                        int v = b.charAt(j) - 'a';
                        adj.get(u).add(v);
                        break;
                    }
                }
            }

            List<Integer> topo = topoSort(V, adj);

            // cycle check
            int used = 0;
            for (boolean p : present)
                if (p)
                    used++;

            int got = 0;
            for (int x : topo)
                if (present[x])
                    got++;

            if (used != got)
                return "";

            // build answer
            StringBuilder sb = new StringBuilder();
            for (int x : topo) {
                if (present[x])
                    sb.append((char) (x + 'a'));
            }

            return sb.toString();
    }

    public static void main(String[] args) {

        String[] words = { "baa", "abcd", "abca", "cab", "cad" };
        String order1 = findOrder(words);
        System.out.println("Order of characters: " + order1);
        System.out.println();
    }
}
