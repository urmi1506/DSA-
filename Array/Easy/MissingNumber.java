package Easy;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);

        // if 0 missing
        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                ans = nums[i - 1] + 1;
                return ans;
            }
        }

        // if last no missing
        return nums.length;
    }
    public static void main(String[] args) {
        int []nums= {0,2,3};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
}
