package DP;

import java.util.Arrays;

public class RodCut {
    public static int maximizeCuts(int n, int x, int y, int z){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); 
        int result = calMaxSegments(n, x, y, z, dp);
        return result < 0 ? 0 : result; 
      }
      
      public static int calMaxSegments(int n, int x, int y, int z, int[] dp){
         if (n == 0) return 0; 
        if (n < 0) return Integer.MIN_VALUE; 
        if (dp[n] != -1) return dp[n]; 
        
        int maxSegments = 1 + Math.max(
            calMaxSegments(n - x, x, y, z, dp),
            Math.max(
                calMaxSegments(n - y, x, y, z, dp),
                calMaxSegments(n - z, x, y, z, dp)
            )
        );
        
        return dp[n] = maxSegments;
      }
      public static void main(String[] args) {
        int n = 4, x = 2, y = 1, z = 1;
        System.out.println(maximizeCuts(n, x, y, z));
      }
}
