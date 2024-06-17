package Recursion;

public class PerfectSum {
    public static void main(String[] args) {
        int n=6;
        int []arr = {5, 2, 3, 10, 6, 8};
        int sum=10;
        System.out.println(perfectSum( arr, n,  sum) );
    }
    static int count = 0;
    final static int MOD = 1000000007;
    static void solve(int arr[], int n, int sum, int ind, int psum) {
        // Base case
        if (ind >= n) {
            if (psum == sum) {
                count = (count + 1) % MOD;
            }
            return;
        }

        // Include 
        // psum += arr[ind];
        solve(arr, n, sum, ind + 1, psum+arr[ind]);
        
        // Backtrack
        // psum -= arr[ind];

        // Exclude 
        solve(arr, n, sum, ind + 1, psum);
    }

    public static int perfectSum(int arr[], int n, int sum) {
        count = 0;  
        solve(arr, n, sum, 0, 0);  
        return count;
    }
}
