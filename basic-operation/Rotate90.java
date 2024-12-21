public class Rotate90 {
    static void rotateby90(int mat[][]) {
        int n = mat.length;
        // transpose...row become col & vice versa
         for (int i=0;i<n;i++){
             for (int j=i+1;j<n;j++){
                 int temp = mat[i][j];
                 mat[i][j] = mat[j][i];
                 mat[j][i] = temp;
             }
         }
        // reverse
         int ind = n-1;
         for (int i=0;i<n;i++){
             for (int j=0;j<n/2;j++){
                 int temp = mat[j][i];
                 mat[j][i] = mat[ind][i];
                 mat[ind][i] = temp;
                 ind--;
             }
             ind = n-1;
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
