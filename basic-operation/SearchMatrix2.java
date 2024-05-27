public class SearchMatrix2 {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int target=8;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
         int cols = matrix[0].length;
 
         int rowInd=0;
         int colInd=cols-1;
           
         while(rowInd<rows && colInd>=0){
             int midVal=matrix[rowInd][colInd];
              if (midVal == target) {
                 return true;
             } else if (midVal < target) {
                rowInd++;
             } else {
                 colInd--;
             }
         }
     return false;
     }
}
