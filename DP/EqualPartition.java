package DP;

import java.util.Arrays;

public class EqualPartition {
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
    return subsetSum(nums ,sum/2);
    }
    private static boolean subsetSum(int[]nums ,int sum){
        int n =nums.length;

        int[][]dp = new int[n+1][sum+1];
        for(int[] r: dp){
           Arrays.fill(r,-1);
        }
    return subsetSumRec(nums ,sum ,n,dp);
    }
    private static boolean subsetSumRec(int[]nums ,int sum ,int n ,int[][]dp){
        // base case
        if(sum ==0) return true;

        if(n == 0) return false;

        if(dp[n][sum] != -1){
        //1 - T , 0 - F
           return dp[n][sum] ==1;
        }

        if(nums[n-1] > sum) {
            dp[n][sum] =subsetSumRec(nums ,sum ,n-1 ,dp) ? 1 : 0;
        }
        else{
            dp[n][sum]=subsetSumRec(nums ,sum - nums[n-1] ,n-1,dp) ||
                      subsetSumRec(nums ,sum ,n-1 ,dp) ? 1:0;
        }
    return dp[n][sum] ==1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean res = canPartition(nums);
        System.out.println(res);
    }
}
