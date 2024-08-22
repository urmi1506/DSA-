package Graph;
import java.util.*;
public class AlienDict {
   
    public static String findOrder(String[] dict, int n, int k) {
        
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            String word1 = dict[i];
            String word2 = dict[i + 1];
            int minLen = Math.min(word1.length(), word2.length());

            for (int j = 0; j < minLen; j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    int u = word1.charAt(j) - 'a';
                    int v = word2.charAt(j) - 'a';
                    adj.get(u).add(v);
                    System.out.println("Edge added: " + word1.charAt(j) + " -> " + word2.charAt(j));
                    break;
                }
            }
        }

        int[] inDegree = new int[k];
        for (int i = 0; i < k; i++) {
            for (int neighbor : adj.get(i)) {
                inDegree[neighbor]++;
            }
        }

        System.out.println("In-degrees: " + Arrays.toString(inDegree));

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < k; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
                System.out.println("Node with 0 in-degree added to queue: " + (char) (i + 'a'));
            }
        }

        // Process the nodes
        while (!queue.isEmpty()) {
            int node = queue.poll();
            res.append((char) (node + 'a'));
            System.out.println("Processing node: " + (char) (node + 'a'));

            for (int neighbor : adj.get(node)) {
                inDegree[neighbor]--;
                System.out.println("Decremented in-degree of: " + (char) (neighbor + 'a'));
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                    System.out.println("Node with 0 in-degree added to queue: " + (char) (neighbor + 'a'));
                }
            }
        }

        if (res.length() < k) {
            return "";
        }

        System.out.println("Topological order: " + res.toString());
        return res.toString();
    }

    public static void main(String[] args) {

        String[] dict1 = {"baa", "abcd", "abca", "cab", "cad"};
        int n1 = dict1.length;
        int k1 = 4;
        String order1 = findOrder(dict1, n1, k1);
        System.out.println("Order of characters: " + order1);
        System.out.println();

       
    }

}
