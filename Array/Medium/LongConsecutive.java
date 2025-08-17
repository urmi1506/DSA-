package Medium;

import java.util.Arrays;

public class LongConsecutive {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        // Edge case
        if(n==0) return 0;
        Arrays.sort(nums);
        // check longest len
        int longest = 1;
        // check Curr Len
        int currCnt =1;

        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) continue;
            else if(nums[i] == nums[i-1]+1){
                currCnt ++;
                longest=Math.max(currCnt, longest);

            } 
            else currCnt =1;

        }
    return longest;
        
    }
    public static void main(String[] args) {
        int []nums={100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
