package Graph;

import java.util.*;

public class GraphRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt();

        ArrayList<Integer>[] adj = new ArrayList[n + 1];

        for(int i = 0; i <= n; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Directed graph
            adj[u].add(v);
        }

        for(int i = 1; i <= n; i++){
            System.out.print(i + " -> ");

            for(Integer node : adj[i]){
                System.out.print(node + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}