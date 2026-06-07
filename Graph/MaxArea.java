package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class MaxArea {
    static int[][]directions ={
        {1,0},
        {0,1},
        {-1,0},
        {0,-1}

    };
    public static int maxAreaOfIsland(int[][] grid) {
         int rows = grid.length;
        int cols = grid[0].length;
        int maxArea =0;

        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){

                if(grid[r][c] == 1){
                    int area =bfs(r,c,grid);
                    maxArea = Math.max(area ,maxArea);
                }
            }
        }
    return maxArea;
    }
    private static int bfs(int r ,int c, int[][]grid){
        int rows =grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = 0;
        q.offer(new int[] {r,c});
        int area =1;

        while(!q.isEmpty()){
            int[] node = q.poll();
            int x = node[0];
            int y = node[1];

            for(int[] dir:directions){
                int nr = x +dir[0];
                int nc = y+dir[1];

                if(nr >= 0 && nr <rows &&
                   nc >=0 && nc <cols &&
                   grid[nr][nc] == 1){
                    q.offer(new int[] {nr,nc});
                    grid[nr][nc] = 0;
                    area++;
                   }
            }
        }
    return area;
    }
    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};

        int maxArea = maxAreaOfIsland(grid);
        System.out.println(maxArea);
    }
}
