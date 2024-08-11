package Graph;

public class MinNoDayDis {

    public static int minDays(int[][] grid) {
            // Check if the current grid has exactly one island
            if (countIslands(grid) != 1) return 0; // If not, return 0 days required
    
            // Try removing each land cell to see if it disconnects the island
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    if (grid[row][col] == 1) {  // If the current cell is land
                        grid[row][col] = 0;  // Temporarily remove the land cell
                        // Check if removing this cell disconnects the island
                        if (countIslands(grid) != 1) return 1;
                        grid[row][col] = 1;  // Restore the land cell
                    }
                }
            }
    
            // If no single cell removal disconnects the island, return 2 days required
            return 2;
        }
    
        private static int countIslands(int[][] grid) {
            boolean[][] visited = new boolean[grid.length][grid[0].length]; // To track visited cells
            int islandCount = 0;  // To count the number of islands
    
            // Iterate through every cell in the grid
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    // If the cell is land and hasn't been visited
                    if (grid[row][col] == 1 && !visited[row][col]) {
                        islandCount++;  // A new island is found
                        exploreIsland(grid, row, col, visited);  // Mark all connected land cells as visited
                    }
                }
            }
            return islandCount;  // Return the total number of islands
        }
    
        private static void exploreIsland(int[][] grid, int row, int col, boolean[][] visited) {
            visited[row][col] = true;  // Mark the current cell as visited
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Directions: up, down, left, right
    
            // Explore all 4 possible directions (up, down, left, right)
            for (int[] direction : directions) {
                int newRow = row + direction[0], newCol = col + direction[1];
                // Check if the new cell is within grid bounds, is land, and hasn't been visited
                if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length 
                    && grid[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                    exploreIsland(grid, newRow, newCol, visited);  // Recursively visit the connected land cells
                }
            }
        }
        public static void main(String[] args) {
            int [][]grid = {{0,1,1,0},{0,1,1,0},{0,0,0,0}};
            System.out.println(minDays(grid));
        }
    }
    

