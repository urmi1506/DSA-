public class RotateMat {
    public static void rotateBy90(int[][]mat){
        int n=mat.length;
        // store rotating val
        int temp[][]=new int[n][n];
        // fill rotating val
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j]=mat[j][n-1-i];
            }
        }
        // copy rotated val into original mat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=temp[i][j];
            }
        }

    }
    public static void main(String[] args) {
        int mat[][]={{1,2},{3,4}};
        rotateBy90(mat);
        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
