package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NoIsland {
    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;

        // Traverse Grid
        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){
                // check for land
                if(grid[r][c] == '1'){
                    // increase cnt
                    cnt++;
                    // check neighbors -->dfs
                    bfs(grid ,r,c);
                }
            }
        }
    return cnt;
    }

    private static void bfs(char[][]grid ,int r ,int c){
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        // start pt
        grid[r][c] = '0';
        // add to queue
        q.offer(new int[] {r,c});
        
        // initialized all four direction
        int []dx ={0,0,1,-1};
        int []dy={1,-1,0,0};

        // traverse upto q not empty
        while(!q.isEmpty()){
            int[] currNode = q.poll();
            //to check neighbor we want exaact r & c of currNode
            int x = currNode[0];
            int y = currNode[1];

            //explore all 4 dir
            for(int d=0; d<4; d++){
                int nr = x + dx[d];
                int nc = y + dy[d];
            
                // check edge cases
                if(nr <0 || nr >= m ||
                   nc < 0 || nc >= n ||
                   grid[nr][nc] == '0'){
                        continue;
                    }
                // add to q & mark visited
                    q.offer(new int[] {nr ,nc});
                    grid[nr][nc] = '0';
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
