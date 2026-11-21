package DP;
import java.util.Arrays;

public class SubsetSum2 {
    static boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        // Initialize memo with -1
        int[][] dp = new int[n+1][sum+1];

        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
    return subsetSumRec(arr, n, sum, dp);
    }

    static boolean subsetSumRec(int[] arr, int n, int sum, int[][] dp) {
        // Base case
        if(sum == 0) return true;

        if(n == 0) return false;

        // Memoization
        if(dp[n][sum] != -1) {
            return dp[n][sum] == 1;
        }
        // If last element is greater than sum, ignore it
        if(arr[n-1] > sum) {
            dp[n][sum] = subsetSumRec(arr, n-1, sum, dp) ? 1 : 0;
        }
        else {
            // Include or exclude
            dp[n][sum] = (subsetSumRec(arr, n-1, sum, dp) ||
                          subsetSumRec(arr, n-1, sum-arr[n-1], dp)) ? 1 : 0;
        }
    return dp[n][sum] == 1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        if (isSubsetSum(arr, sum) == true)
            System.out.println("Found a subset with given sum");
        else
            System.out.println("No subset with given sum");
    }
}
