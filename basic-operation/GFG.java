import java.util.*;
class GfG
{
    public static void main(String[] args){
      try(Scanner sc=new Scanner(System.in)){
      int n=sc.nextInt();
      System.out.println(" Enter Size of Array  :"+n);
      int[] arr={1,2,3,4};
      print(arr, n);
      
      }
    }
    public static void print(int arr[], int n)
    {
       for(int i=0;i< n && i<n;i++){
         if( (i&1)== 0){
            System.out.print(arr[i]+" ");
        
        } 
    }
      }
    }

        
    
