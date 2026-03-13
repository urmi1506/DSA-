package Graph;

import java.util.Scanner;

public class GraphImplemetation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        int m=3;
        int[][]adj =new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int u =sc.nextInt();
            int v =sc.nextInt();

            adj[u][v]=1;
            // for only undirected graph
            adj[v][u]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}