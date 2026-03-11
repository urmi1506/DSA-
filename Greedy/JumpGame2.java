package Greedy;

public class JumpGame2 {
    public static int jump(int[] nums) {
       // Initialize jumps and range trackers
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        // Loop through array up to second last index
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest index we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If current index reaches the end of current range
            if (i == currentEnd) {
                // Increment jump count
                jumps++;

                // Update range to the farthest index
                currentEnd = farthest;
            }
        }

        // Return the total number of jumps
        return jumps;
    }
    public static void main(String[] args) {
        int[]nums = {2,3,1,1,4};
        int res = jump(nums);
        System.out.println(res);
    }
}
