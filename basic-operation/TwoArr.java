import java.util.Scanner;

public class TwoArr{
    static boolean isPresent(int [][]arr,int target,int row ,int col){
        for( row=0;row<3;row++){
            for( col=0;col<4;col++){
               if(arr[row][col]==target){
                return true;
               }
            }
          }
          return false;
    }
    public static void main(String[] args){
       
        int [][]arr=new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element");

        for(int row=0;row<3;row++){
          for(int col=0;col<4;col++){
            arr[row][col]=sc.nextInt();
          }
        }
        System.out.println("Elements are:");
        for(int row=0;row<3;row++){
            System.out.println();
            for(int col=0;col<4;col++){
              System.out.println(arr[row][col]);
              
            }
          }
          System.out.println("Enter element for search:");
          int target=sc.nextInt();
          if(isPresent(arr,target,3,4)){
                System.out.println("Element found");
          }
          else{
            System.out.println("Element not found");

          }

        }
}