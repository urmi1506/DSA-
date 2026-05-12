package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange{
    public static int orangesRotting(int[][] grid) {
        
        // If the grid is empty, return 0
        if (grid.length == 0) return 0;

        // Get number of rows and columns
        int m = grid.length;
        int n = grid[0].length;

        // Variable to count total oranges (fresh + rotten)
        int total = 0;

        // Variable to count oranges that became rotten
        int count = 0;

        // Queue to store positions of rotten oranges
        Queue<int[]> rotten = new LinkedList<>();

        // Traverse the grid to populate total oranges and initial rotten positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                // Count all fresh or rotten oranges
                if (grid[i][j] != 0) total++;

                // Add rotten orange position to queue
                if (grid[i][j] == 2) {
                    rotten.add(new int[]{i, j});
                }
            }
        }

        // Arrays for direction vectors (up, down, left, right)
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        // Variable to track minutes passed
        int days = 0;

        // BFS loop to rot oranges level by level
        while (!rotten.isEmpty()) {
            
            // Number of rotten oranges to process in this round
            int k = rotten.size();

            // Add to the count of rotted oranges
            count += k;

            // Process each rotten orange
            for (int i = 0; i < k; i++) {
                
                int[] pos = rotten.poll();
                int x = pos[0], y = pos[1];

                // Check all 4 directions
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    // Skip out-of-bound or non-fresh cells
                    if (nx < 0 || ny < 0 || nx >= m || ny >= n || grid[nx][ny] != 1)
                        continue;

                    // Mark orange as rotten
                    grid[nx][ny] = 2;

                    // Add new rotten orange to queue
                    rotten.add(new int[]{nx, ny});
                }
            }

            // Only increase time if we still have new oranges to process
            if (!rotten.isEmpty()) days++;
        }

        // If all oranges are rotted, return days; otherwise return -1
        return total == count ? days : -1;
    }
    public static void main(String[] args) {
        int[][] grid ={{2,1,1},{1,1,0},{0,1,1}};
        int minimum_time = orangesRotting(grid);
        System.out.println(minimum_time);
    }
}