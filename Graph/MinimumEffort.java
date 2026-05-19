package Graph;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumEffort{
    public static int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        // Stores minimum effort required to reach each cell
        int[][] effort = new int[rows][cols];

        for (int[] row : effort) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Starting cell effort is 0
        effort[0][0] = 0;

        // Min Heap -> {effort, row, col}
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.add(new int[]{0, 0, 0});

        // Directions: up, right, down, left
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int currEffort = current[0];
            int r = current[1];
            int c = current[2];

            // Reached destination
            if (r == rows - 1 && c == cols - 1) {
                return currEffort;
            }

            // Visit all 4 neighbours
            for (int i = 0; i < 4; i++) {

                int nr = r + dr[i];
                int nc = c + dc[i];

                // Check boundaries
                if (nr >= 0 && nc >= 0 && nr < rows && nc < cols) {

                    // Effort needed for this move
                    int diff = Math.abs(heights[r][c] - heights[nr][nc]);

                    // Maximum effort in the path
                    int newEffort = Math.max(currEffort, diff);

                    // Update if better path found
                    if (newEffort < effort[nr][nc]) {

                        effort[nr][nc] = newEffort;

                        pq.add(new int[]{newEffort, nr, nc});
                    }
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) {

        int[][] heights = {
                {1, 2, 2},
                {3, 8, 2},
                {5, 3, 5}
        };

        int minimum_effort_path = minimumEffortPath(heights);

        System.out.println(minimum_effort_path);
    }

}