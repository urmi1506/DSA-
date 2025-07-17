package Medium;

public class SetMatZero2 {
    public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] markRow = new int[n];
        int[] markCol = new int[m];
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(matrix[row][col]==0){
                markRow[row]=1;
                markCol[col]=1;
                }
            }
        }
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(markRow[row]==1 || markCol[col]==1){
                    matrix[row][col]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


}
