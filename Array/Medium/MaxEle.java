package Medium;

public class MaxEle{
    public static int majorityElement(int[] nums) {
        // Track maximum cnt of elements
        int maxCnt = 0;
        // Assume initially majorityele == 1st ele
        int majorityElement = nums[0];

        // Find majority Ele
        for (int i = 0; i < nums.length; i++) {
            int cnt = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }
        // Compare maxCnt nd update majority ele
            if (cnt > maxCnt) {
                maxCnt = cnt;
                majorityElement = nums[i];
            }
        }
        return majorityElement;
    }
    public static void main(String[] args) {
        int[]nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}

