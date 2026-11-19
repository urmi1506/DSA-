package DP;

import java.util.Arrays;

public class KnapSack2 {
    public static int knapsack(int W, int val[], int wt[]) {

        // Number of items available
        int n = val.length;

        // Create a 2D DP table because our recursive state
        // depends on two variables: number of items (n) and capacity (W)
        // dp[n][W] stores the maximum value using first n items
        // with knapsack capacity W
        int[][] dp = new int[n + 1][W + 1];

        // Initialize all states with -1
        // -1 indicates that a subproblem has not been solved yet
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Start recursion with all items and the original capacity
        return knapsackRec(W, val, wt, n, dp);
    }

    private static int knapsackRec(int W, int val[], int wt[], int n, int[][] dp) {

        // Base case:
        // If no items remain OR capacity is zero,
        // we cannot obtain any additional value
        if (n == 0 || W == 0) {
            return 0;
        }

        // Memoization:
        // If this state has already been calculated,
        // return the stored result instead of recomputing it
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        // Check if the current item (index n-1) -->start from last idx as it 
        // help to reduce idx and ensure item reach only once -->but not rule to follow from last idx
        // inside the remaining knapsack capacity
        if (wt[n - 1] <= W) {

            // Pick:
            // Include the current item's value,
            // reduce the capacity by its weight,
            // and move to the previous item so it cannot be reused
            //
            // Not Pick:
            // Skip the current item,
            // keep the capacity unchanged,
            // and move to the previous item
            //
            // Since we want maximum value, choose the better option
            // and store the result in dp[n][W]
            return dp[n][W] = Math.max(
                val[n - 1] + knapsackRec(
                    W - wt[n - 1], val, wt, n - 1, dp
                ),
                knapsackRec(
                    W, val, wt, n - 1, dp
                )
            );
        }

        // If the current item cannot fit,
        // we have no choice but to skip it
        // Capacity remains unchanged and we consider previous items
        return dp[n][W] = knapsackRec(
            W, val, wt, n - 1, dp
        );
    }
    public static void main(String[] args) {
       int W = 4, val[] = {1,2,3}, wt[] = {4,5,1};
       System.out.println(knapsack(W, val, wt));
    }
}

