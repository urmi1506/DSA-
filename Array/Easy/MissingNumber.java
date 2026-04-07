package Easy;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        // if 0 missing
        if (nums[0] != 0) {
            return 0;
        }
        
        // check other missing no
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return nums[i - 1] + 1;
            }
        }

        // if last no missing
        return nums.length;
    }
    public static void main(String[] args) {
        int []nums= {0,1,2,3};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
}
