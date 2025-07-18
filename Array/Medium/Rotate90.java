package Medium;

public class Rotate90 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j]=matrix[j][n-i-1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=temp[i][j];
            }
        }
    }
   
public static void main(String[] args) {
        int mat[][]={{1,2},{3,4}};

        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}
}
