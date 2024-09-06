public class LargestSum {
    static void printsum(int [][]arr,int row,int col){
        int largestRowSum = Integer.MIN_VALUE; 
        int largestRowIndex = -1; 
        for ( row = 0; row < arr.length; row++) {
            int sum=0;
            for ( col = 0; col < arr.length; col++) {
               sum+=arr[row][col];
            }
            System.out.println("Sum of row:"+sum);
            if(largestRowSum < sum){
                largestRowSum=sum;
                largestRowIndex=row;
            }
        }
        System.out.println("Largest row sum is: " + largestRowSum + " at index: " + largestRowIndex);
       
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        for (int row = 0; row < arr.length; row++) {
            System.out.println();
            for (int col = 0; col < arr.length; col++) {
               System.out.println(arr[row][col]);
            }
        }
        printsum(arr, 3, 3);
    }
}
