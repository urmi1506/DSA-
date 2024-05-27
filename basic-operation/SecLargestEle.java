import java.util.Arrays;

public class SecLargestEle {
    static int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
           int k=arr[n-1];
            if(arr[i]!=k){
                return arr[i];
                
            }
        }
         return -1;
    }
    
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {12, 35, 1, 10, 34, 1};
        
      
        System.out.println(print2largest(arr, n));
    }
}
