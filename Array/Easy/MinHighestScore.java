package Easy;

import java.util.Arrays;

public class MinHighestScore {
    public static int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[k - 1] - nums[0];
        for (int i = 0; i + k <= n; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={9,4,1,7};
        int k=2;

       int res= minimumDifference(nums, k);
       System.out.println(res);
    }

}
