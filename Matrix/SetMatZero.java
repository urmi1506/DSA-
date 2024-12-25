package Matrix;

public class SetMatZero {
    public static void setMatrixZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Traverse matrix to mark rows & columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    markRow(mat, i);
                    markCol(mat, j);
                }
            }
        }

        convert(mat);
    }

    private static void markRow(int[][] mat, int i) {
        int m = mat[0].length;
        for (int j = 0; j < m; j++) {
            if (mat[i][j] != 0) { 
                mat[i][j] = -1;
            }
        }
    }

    private static void markCol(int[][] mat, int j) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            if (mat[i][j] != 0) { 
                mat[i][j] = -1;
            }
        }
    }

    private static void convert(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == -1) {
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
