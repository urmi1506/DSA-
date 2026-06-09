package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WallndGates{
    public static void islandsAndTreasure(int[][] grid) {
        if(grid == null || grid.length == 0){
            return;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        // Traverse a grid 
        for(int i=0; i< rows; i++){
            for(int j=0; j<cols; j++){
                // add a gate to queue
                if(grid[i][j] == 0){
                    q.offer(new int[] {i ,j});
                }
            }
        }

        int[][] directions ={
            {-1,0} ,{1,0} ,{0 ,-1} ,{0 ,1}
        };

        // BFS
        while(!q.isEmpty()){
            // take currNode to check
            int []node = q.poll();
            int x = node[0];
            int y = node[1];
            
            for(int[] dir : directions){
                int nr = x + dir[0];
                int nc = y + dir[1];

                // cell must inside grid , not wall ,unvisited
                if(nr >= 0 && nr < rows && nc >= 0 && nc < cols 
                   && grid[nr][nc] == Integer.MAX_VALUE){
                        // Set distance from nearest gate
                        grid[nr][nc] = grid[x][y]+1;
                        // add updated grid to queue to check
                        q.offer(new int[] {nr,nc});
                   }
            }

        }
    }
    public static void main(String[] args) {
        int[][] grid = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},
                        {2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
        
        islandsAndTreasure(grid);

        for (int[] it : grid) {
            System.out.println(Arrays.toString(it));
        }
    }
}