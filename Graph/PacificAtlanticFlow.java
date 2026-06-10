package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class PacificAtlanticFlow{
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        // check cell visited for pacific and Atlantic -->initally all false
        boolean [][]pacific = new boolean [rows][cols];
        boolean [][]atlantic = new boolean [rows][cols];

        // for BFS ---> queue
        Queue<int[]> pacificq1 = new LinkedList<>();
        Queue<int[]> atlanticq2 = new LinkedList<>();

        // mark left row --> pacific and right row --> atlantic
        for(int r=0; r<rows; r++){
            // left row --> pacific
            pacific[r][0] = true;
            pacificq1.offer(new int[] {r,0});

            // right row --> atlantic
            atlantic[r][cols-1] = true;
            atlanticq2.offer(new int[] {r ,cols-1}); 
        }

        // mark top --> pacific and bottom --> atlantic
        for(int c=0; c<cols; c++){
            // top --> pacific
            pacific[0][c] = true;
            pacificq1.offer(new int[] {0 ,c});

            // bottom --> atlantic
            atlantic[rows-1][c] = true;
            atlanticq2.offer(new int[] {rows-1 ,c});
        }

        // perform bfs for both to get all cell
        bfs(heights,pacific,pacificq1);
        bfs(heights,atlantic,atlanticq2);

        // cells ---> reachable from both oceans
        List<List<Integer>> result = new ArrayList<>();

        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(pacific[r][c] && atlantic[r][c]){
                    result.add(Arrays.asList(r,c));
                }
            }
        }
    return result;    
    }

    private static void bfs(int[][]heights,boolean[][] visited,Queue<int[]>queue){
        int rows = heights.length;
        int cols = heights[0].length;

        int[][] directions = {
                {1, 0},  
                {-1, 0},
                {0, 1},   
                {0, -1}  
        };

        while (!queue.isEmpty()) {

            // Remove current cell
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            for (int[] dir : directions) {

                int nr = r + dir[0];
                int nc = c + dir[1];

                // Skip if outside grid
                if (nr < 0 || nr >= rows || nc < 0 || nc >= cols) {
                    continue;
                }

                // Skip -->already visited
                if (visited[nr][nc]) {
                    continue;
                }

                // Reverse flow 

                if (heights[nr][nc] < heights[r][c]) {
                    continue;
                }

                // Mark reachable from this ocean
                visited[nr][nc] = true;

                // Add to queue for exploration
                queue.offer(new int[]{nr, nc});
            }
        }
    }
    public static void main(String[] args) {
        int[][] heights = {{4,2,7,3,4},
                           {7,4,6,4,7},
                           {6,3,5,3,6}};
        
        List<List<Integer>> res = pacificAtlantic(heights);
        System.out.println(res);
    }
}