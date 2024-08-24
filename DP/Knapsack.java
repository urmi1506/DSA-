package DP;

public class Knapsack {
    static int knapSack(int W, int wt[], int val[]) {
        int n = val.length;
        
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }
    public static void main(String[] args) {
       int W = 4, val[] = {1,2,3}, wt[] = {4,5,1};
       System.out.println(knapSack(W, wt, val));
    }
}
