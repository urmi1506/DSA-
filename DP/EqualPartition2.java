package DP;

public class EqualPartition2 {
    public static boolean canPartition(int[] nums) {
        int n=nums.length;
        // cal overall sum of arr
        int sum =0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            
        }
        // odd -->partition not possible
            if(sum % 2 != 0){
                return false;
            }
    return isSubsetSum(nums ,sum/2);
    }
    static boolean isSubsetSum(int nums[], int sum) {
        int n = nums.length;
        boolean [][]dp = new boolean[n+1][sum+1];
        // sum is 0 -->always true
        for(int i=0; i<=n; i++){
            dp[i][0] = true;
        }
        
        // iterate
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j -nums[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
    return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean res = canPartition(nums);
        System.out.println(res);
    }
}
