package DP;

import java.util.PriorityQueue;

public class MinCostPath2 {
     public static int minimumCostPath(int[][] grid) {
        int n = grid.length;

        // Priority Queue to store the current cost and cell positions (row, col).
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Directions for right, down, left, and up movements.
        int[] dRow = {0, 1, 0, -1}; // Row changes for right, down, left, up
        int[] dCol = {1, 0, -1, 0}; // Column changes for right, down, left, up

        // Visited array to keep track of visited cells.
        boolean[][] visited = new boolean[n][n];

        // Add starting point to the priority queue with initial cost.
        pq.add(new int[]{grid[0][0], 0, 0}); // {cost, row, col}

        while (!pq.isEmpty()) {
            // Extract the cell with the least cost from the priority queue.
            int[] curr = pq.poll();
            int cost = curr[0];
            int row = curr[1];
            int col = curr[2];

            // If we reach the bottom-right corner, return the cost.
            if (row == n - 1 && col == n - 1) {
                return cost;
            }

            // Mark the cell as visited.
            if (visited[row][col]) {
                continue;
            }
            visited[row][col] = true;

            // Explore all 4 possible directions.
            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                // Check if the new position is within bounds and not yet visited.
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    // Add the new position to the priority queue with the updated cost.
                    pq.add(new int[]{cost + grid[newRow][newCol], newRow, newCol});
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[][] grid = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}};
        System.out.println(minimumCostPath(grid));
     }
}
