package Medium;

// TC : O(N) SC: O(1)
public class MaxSubArr3 {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        // Initialize both to 1st ele
        int maxSum = nums[0];
        int maxEnding = nums[0];

        for (int i = 1; i < n; i++) {
            
            // Find best maxEnding
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            // Find max Sum
            maxSum = Math.max(maxEnding, maxSum);
            
        }
    return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(maxSubArray(nums));
    }
}
