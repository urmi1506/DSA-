package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange{
    public static int orangesRotting(int[][] grid) {
        
        // edge Case --->empty cell
        if(grid.length == 0) return 0;

        // cal size for rows & cols
        int m =grid.length;
        int n=grid[0].length;

        // total --->Store total rotten+fresh oranges
        int total=0;
        //cnt --> store oranges that became rotten
        int cnt =0;
        // queue --> perform BFS
        Queue<int[]> rotten = new LinkedList<>();
        int minutes=0;

        // Traverse through grid
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                // check rotten oranges + fresh oranges
                if(grid[i][j] != 0){
                    total++;
                } 
                if (grid[i][j] == 2) {
                    rotten.add(new int[]{i, j});
                }

            }
        }
        // initialized all four direction
        int []dx ={0,0,1,-1};
        int []dy={1,-1,0,0};

        // perform BFS
        while(!rotten.isEmpty()){
            //check rotten oranges +nt
            int k= rotten.size();
            // add to cnt
            cnt +=k;


            // traverse through rotten oranges
            for(int i=0; i< k;i++){
                int[] pos = rotten.poll();
                int x=pos[0];
                int y=pos[1];
                // check all 4 direction
                for(int d=0; d<4; d++){
                    int nx= x+dx[d];
                    int ny =y+dy[d];
                // check boudaries & non fresh oranges
                if(nx <0 || ny<0 || nx >=m|| ny>=n|| grid[nx][ny] !=1 ){
                    continue;
                }
                // make fresh orange rotten
                grid[nx][ny] = 2;

                rotten.add(new int[]{nx, ny});
                }
            }
            if(!rotten.isEmpty()) {
                minutes++;
            }
        }
    return total == cnt ? minutes : -1;
    }
    public static void main(String[] args) {
        int[][] grid ={{2,1,1},{1,1,0},{0,1,1}};
        int minimum_time = orangesRotting(grid);
        
        System.out.println(minimum_time);
    }
}