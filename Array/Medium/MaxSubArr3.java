package Medium;

public class MaxSubArr3 {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        // Initialize both to 1st ele
        int maxSum = nums[0];
        int maxEnding = nums[0];

        for (int i = 0; i < n; i++) {
            
            // Find best maxEnding
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            // Find max Sum
            maxSum = Math.max(maxEnding, maxSum);
        }
    return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
