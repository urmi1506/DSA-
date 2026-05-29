package Graph;

public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols =grid[0].length;

        int perimeter =0;

        //direction
        int[][] dirs ={
            {-1, 0}, 
            {1, 0},  
            {0, -1}, 
            {0, 1}   
        };

        // Traverse Grid
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                // check land
                if(grid[i][j] ==1){
                    for(int[] d : dirs){
                        // check neighbour rows
                        int nr =i +d[0];
                        // check neighbour cols
                        int nc =j+d[1];

                        // permeter -> neighbour is outside grid || water
                        if(nr <0 || nc<0 || nr >=rows || nc >=cols || grid[nr][nc] == 0){
                            perimeter++;
                        }
                    }
                }
            }
        }
    return perimeter;
    }
}
