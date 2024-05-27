public class PrintrowEle {
    static void rowsum (int [][]arr,int row,int col){
        for( row=0; row<3; row++){  //for col wise sum u just need take col loop first then row
            int sum=0;
            for ( col= 0; col<3; col++) {
              sum+=arr[row][col];     
            }
            System.out.println("Row sum is:"+sum);
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Element are:");
        for(int row=0; row<3; row++){
            System.out.println();
            for (int col= 0; col<3; col++) {
              System.out.println(arr[row][col]);     
            }
        }
        rowsum(arr, 3, 3);
    }
}
