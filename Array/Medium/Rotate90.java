package Medium;

public class Rotate90 {
    public static void rotate(int[][] matrix) {
        int n=matrix.length;

        int ans[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[j][n-i-1]=matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
        
    }
   
public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);
        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}
}
