package Medium;

// TC : O(N*M*(N+M)) SC: O(1)
public class SetMatZero {
    public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        // traverse matrix to find zero
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(matrix[row][col]==0){
                markRow(matrix,row);
                markCol(matrix,col);
                }
            }
        }
    convert(matrix);
    }
    // markRow as -1
    public static void markRow(int[][]matrix,int row){
        int m=matrix[0].length;
        for(int col=0; col<m; col++){
            if(matrix[row][col] !=0) matrix[row][col]=-1;
        }
    }
     // markCol as -1
    public static void markCol(int[][]matrix,int col){
        int n=matrix.length;
        for(int row=0; row<n; row++){
            if(matrix[row][col]!=0) matrix[row][col]=-1;
        }
    }
    // convert matrix -1 to 0
    public static void convert(int[][]matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(matrix[row][col]==-1) matrix[row][col]=0;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for (int[] row : matrix) {
            for (int res : row) {
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }

}
