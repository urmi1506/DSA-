package DP;

public class MinCostPath1 {
    public static int minimumCostPath(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        
        // iterate row
        for (int i = 0; i < n; i++) {
            // iterate col
            for (int j = 0; j < n; j++) {
                // First cell (top-left corner)....no movement
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                }
                // First row..move right
                else if (i == 0) {
                    // j-1 for prev cost & gird[i][j] for curr cost same for i
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                }
                // First col...moving down
                else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                }
                //remaing cell...moving right or down
                else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
        }
        
        // Return min cost to reach bottom-right cell.
        return dp[n - 1][n - 1];
    }
    public static void main(String[] args) {
       int[][] grid = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}};
       System.out.println(minimumCostPath(grid));
    }
}
