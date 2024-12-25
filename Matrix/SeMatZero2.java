package Matrix;

public class SeMatZero2 {
    public static void setMatrixZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        // Traverse matrix to mark rows & columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
// covert 1 to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(mat);

        setMatrixZeroes(mat);

        System.out.println("Matrix After Setting Zeros:");
        printMatrix(mat);
    }

    private static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
