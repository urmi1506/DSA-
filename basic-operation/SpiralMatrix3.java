import java.util.Arrays;

public class SpiralMatrix3 {

        public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
            // Directions: right, down, left, up
            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; 
            // Result array to store coordinates in spiral order
            int[][] result = new int[rows * cols][2];
            int steps = 0; // Number of steps to move in the current direction
            int d = 0; // Direction index: 0=right, 1=down, 2=left, 3=up
            int count = 1; // Count of filled positions
            
            // Start with the initial position
            result[0] = new int[]{rStart, cStart};
            
            // Continue until all positions in the matrix are filled
            while (count < rows * cols) {
                // Increase step size when moving horizontally (right or left)
                if (d == 0 || d == 2) steps++;
    
                // Move in the current direction for 'steps' times
                for (int i = 0; i < steps; i++) {
                    rStart += directions[d][0]; // Update row
                    cStart += directions[d][1]; // Update column
                    
                    // Check if the new position is within bounds
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        result[count++] = new int[]{rStart, cStart}; // Store valid position
                    }
                    
                    // If all positions are filled, return the result
                    if (count == rows * cols) return result;
                }
                
                // Move to the next direction in the order right -> down -> left -> up
                d = (d + 1) % 4; 
            }
            
            return result;
        }
        public static void main(String[] args) {
            int rows = 1, cols = 4, rStart = 0, cStart = 0;
            int [][]ans=spiralMatrixIII( rows,  cols,  rStart,  cStart);
            for (int[] res : ans) {
                System.out.println(Arrays.toString(res));
            }
        }
    }
    

