package Medium;

import java.util.Arrays;

public class LongConsecutive {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // check longest len
        int res = 1;
        // check Curr Len
        int cnt =1;

        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == nums[i-1]+1) cnt ++;
            else cnt =1;

            res=Math.max(res,cnt);

        }
    return res;
        
    }
    public static void main(String[] args) {
        int []nums={100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
