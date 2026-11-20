package DP;

public class SubsetSum {
    static boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        boolean [][]dp = new boolean[n+1][sum+1];
        // sum is 0 -->always true
        for(int i=0; i<=n; i++){
            dp[i][0] = true;
        }
        
        // iterate
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j -arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
    return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        boolean result = isSubsetSum(arr, sum);
        System.out.println("Is there a subset with sum " + sum + "? " + result);
    }
}
