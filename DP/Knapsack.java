package DP;

public class Knapsack {
     public static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        
        int[][] dp = new int[n+1][W+1];
        
        for(int i=0; i<= n; i++){
            for(int j=0; j<=W; j++){
                // initialization
                if(i==0 || j==0) dp[i][j] =0;
                
                // Top down approach -->choice diagram
                else if(wt[i-1] <= j){
                   dp[i][j] = Math.max(val[i-1] +dp[i-1][j-wt[i-1]],
                                                dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
    return dp[n][W];
    }
    public static void main(String[] args) {
       int W = 4, val[] = {1,2,3}, wt[] = {4,5,1};
       System.out.println(knapsack(W, val, wt));
    }
}
