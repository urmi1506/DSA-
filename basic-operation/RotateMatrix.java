// vimp
public class RotateMatrix {
   
        public static void rotateMatrix(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            
            // Create a temporary matrix to store the rotated values
            int[][] rotatedMatrix = new int[cols][rows];
            
            // Rotate the matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // Assign the value from the original matrix to the rotated matrix based on the logic
                    rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
                }
            }
            
            // Copy the rotated values back to the original matrix
            for (int i = 0; i < cols; i++) {
                System.arraycopy(rotatedMatrix[i], 0, matrix[i], 0, rows);
            }
        }
        
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            
            System.out.println("Original Matrix:");
            printMatrix(matrix);
            
            rotateMatrix(matrix);
            
            System.out.println("\nRotated Matrix:");
            printMatrix(matrix);
        }
    }
    

