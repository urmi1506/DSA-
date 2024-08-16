package DP;

// Rod Cut Problem is same as this problem...(Brute Force Solution)
public class MaximizeCutSeg {

    public static int maximizeCuts(int n, int x, int y, int z) {
            int[] dp = new int[n + 1];
            dp[0] = 0;
    
            for (int i = 1; i <= n; i++) {
                // Check if a cut of length x is possible
                if (i >= x && dp[i - x] != -1) {
                    dp[i] = Math.max(dp[i], dp[i - x] + 1);
                }
                // Check if a cut of length y is possible
                if (i >= y && dp[i - y] != -1) {
                    dp[i] = Math.max(dp[i], dp[i - y] + 1);
                }
                // Check if a cut of length z is possible
                if (i >= z && dp[i - z] != -1) {
                    dp[i] = Math.max(dp[i], dp[i - z] + 1);
                }
            }
    
            // If dp[n] is -1, no segments can be cut
            return dp[n] == -1 ? 0 : dp[n];
        }
    
        public static void main(String[] args) {
            int n = 7;
            int x = 2, y = 1, z = 3;
            System.out.println(maximizeCuts(n, x, y, z)); 
        }
    }
    

