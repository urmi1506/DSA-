package SlidingWindow;
public class ArrMaxSum {
    public static int maxSum (int n,int k , int[] arr){
        if (n < k) System.out.println("Invalid");

        int maxi =0;
        for (int i = 0; i < k; i++) {
            maxi += arr[i];
        }

        int window_sum = maxi;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] -arr[i-k];
            maxi = Math.max(maxi, window_sum);
        }
    return maxi;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(n, k, arr));
    }
}
