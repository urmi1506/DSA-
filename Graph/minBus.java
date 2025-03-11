package Graph;
import java.io.*;
import java.util.*;
public class minBus {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            
            String[] arr_Passengers = br.readLine().split(" ");
            int[] Passengers = new int[N];
            for (int i_Passengers = 0; i_Passengers < arr_Passengers.length; i_Passengers++) {
                Passengers[i_Passengers] = Integer.parseInt(arr_Passengers[i_Passengers]);
            }
            
            int[][] Edges = new int[N-1][2];
            for (int i_Edges = 0; i_Edges < N-1; i_Edges++) {
                String[] arr_Edges = br.readLine().split(" ");
                for (int j_Edges = 0; j_Edges < arr_Edges.length; j_Edges++) {
                    Edges[i_Edges][j_Edges] = Integer.parseInt(arr_Edges[j_Edges]);
                }
            }
            
            int out_ = solve(N, Passengers, Edges);
            System.out.println(out_);
        }
        
        wr.close();
        br.close();
    }
    
    static int solve(int N, int[] Passengers, int[][] Edges) {
        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] edge : Edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        
        int buses = 0;
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 2; i <= N; i++) {
            if (graph[i].size() == 1 && Passengers[i] == 1) {
                queue.add(i);
                visited[i] = true;
                buses++;
            }
        }
        
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int stop = queue.poll();
            
            for (int neighbor : graph[stop]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        
        return buses;
    }
}

