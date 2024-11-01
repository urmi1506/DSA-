import java.util.Arrays;

public class SwapMax {
    public static long maxSum(long[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        long maxsum = 0;
        for(int i = 0 , j = n-1; i<n && j>=0; i++,j--)
          maxsum+=Math.abs(arr[i]-arr[j]);
        
        return maxsum;
    }
    public static void main(String[] args) {
       long arr[] = {4, 2, 1, 8};
       System.out.println(maxSum(arr));
    }
}
