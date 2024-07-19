import java.util.Arrays;

public class CntSmallerEle {
    static int[] constructLowerArray(int[] arr) {
       int n=arr.length;
       int []res=new int[n];
       for (int i = 0; i < n-1; i++) {
        int count=0;
        for (int j = i+1; j < n ; j++) {
            if(arr[j]<arr[i])
            {
                count++;
        }
        
       }
     res[i]=count; 
    }
   return res;
  }
  public static void main(String[] args) {
    int[] arr = {4, 5, 2, 10, 8};
    int[] result = constructLowerArray(arr);
    // Returns: A string representation of the array, with each element separated by commas and enclosed in square brackets. Arrays.toString(result) provides a string representation of the array
        System.out.println(Arrays.toString(result));
  }
}
