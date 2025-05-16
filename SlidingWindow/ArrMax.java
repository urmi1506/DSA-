package SlidingWindow;

public class ArrMax {
    public static int maxArr(int k , int[]arr,int n){
        int maxi = Integer.MIN_VALUE;
       for (int i = 0; i < n-3; i++) {
          int currsum=0;
          for (int j = i; j < i+3; j++) {
            currsum += arr[j];
            maxi = Math.max(maxi, currsum);
          }
       }
       return maxi;
    }
    public static void main(String[] args) {
         int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxArr(k, arr, n));
    }
}
