package Matrix;

public class SearchMatrixs {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=n*m-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            // most imp....find out idx of row and col
            int midVal=matrix[mid/m][mid%m];
            if(target == midVal) return true;
            else if(target < midVal) high=mid-1;
            else low=mid+1;
        }
        
    return false;   
        
    }
    public static void main(String[] args) {
        int [][]matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix, target));
    }
    

}
