//very imp
public class SearchMatrix {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int target=8;
        System.out.println(searchMatrix(matrix,target));
    }
   
        public static boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;
    
            int low = 0;
            int high = rows * cols - 1;
    
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int midVal = matrix[mid / cols][mid % cols]; 
    
                if (midVal == target) {
                    return true;
                } else if (midVal < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
    
            return false;
        }
    }
    

