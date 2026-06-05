package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NoIsland {
    static int[][] directions = {
        {0,1},
        {1,0},
        {0,-1},
        {-1,0}
    };
    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int island =0;

        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(grid[r][c] == '1'){
                    bfs(grid ,r,c);
                    island++;
                }
            }
        }
    return island;
    }

    public static void bfs(char[][]grid ,int r ,int c){
        int rows =grid.length;
        int cols =grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        grid[r][c] = '0';
        queue.add(new int[] {r ,c});

        while(!queue.isEmpty()){
            int[] node = queue.poll();
            int x = node[0];
            int y =node[1];

            for(int[] dir : directions){
                int nr = x + dir[0];
                int nc = y + dir[1];

                if(nr >=0  && nc >=0 && nr < rows && nc < cols && grid[nr][nc] == '1'){
                    queue.add(new int[] {nr ,nc});
                    grid[nr][nc] = '0';
                }
            }
        }

    }
    public static void main(String[] args) {
        char [][]grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},
                         {'1','1','0','0','0'},{'0','0','0','0','0'}};

        int res = numIslands(grid);
        System.out.println(res);

        
    }
}
