package Medium;
// TC : O(N^2) SC: O(1)
public class MaxSubArr {
     public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int currSum =0;
            for(int j= i; j<n ; j++){
                currSum += nums[j];
                if(currSum > maxSum ) maxSum = currSum;
                if (currSum <0) currSum=0;
            }
        }
    return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
