package DP;

public class CountSq {
    public static int countSquares(int[][] matrix) {
        int n = matrix.length;   
        int m = matrix[0].length; 
        
        int[][] dp = new int[n][m];
        // store total cnt of square
        int res = 0;
        
        // first column of DP table
        for (int i = 0; i < n; i++) {
            dp[i][0] = matrix[i][0];
            res += dp[i][0];
        }
        
        // first row of DP table
        for (int j = 1; j < m; j++) {
            dp[0][j] = matrix[0][j];
            res += dp[0][j];
        }
        
        // Fill DP table for remaining cells
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][j] == 1) {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
                }
                res += dp[i][j];
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int [][] matrix={
            {1,0,1},
            {1,1,0},
            {1,1,0}
        };
        System.out.println(countSquares(matrix));
    }
}
