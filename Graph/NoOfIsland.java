package Graph;

public class NoOfIsland {
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
                    dfs(grid ,r,c);
                }
            }
        }
    return cnt;
    }

    private static void dfs(char[][]grid ,int r ,int c){
        int m = grid.length;
        int n = grid[0].length;

        // Edge cases --> outside grid || water
        if(r < 0 || r >= m ||
           c < 0 || c >= n || grid[r][c] == '0'){
            return;
           }
        
        // mark as visited
        grid[r][c] = '0';

        // explore all 4 direction
        dfs(grid ,r-1,c);
        dfs(grid ,r+1 ,c);
        dfs(grid ,r,c-1);
        dfs(grid ,r,c+1);
    }
    public static void main(String[] args) {
        char [][]grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},
                         {'1','1','0','0','0'},{'0','0','0','0','0'}};

        int res = numIslands(grid);
        System.out.println(res);

        
    }
}
