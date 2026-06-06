package Medium;

import java.util.Arrays;

public class LongConsecutive {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        // Edge case
        if(n==0) return 0;
        Arrays.sort(nums);
        // check longest len --->tc : n=1 
        int longest = 1;
        // check Curr Len ---> tc : n=1
        int currCnt =1;

        for (int i = 1; i < n; i++) {
            // skip duplicates --> ex tc :[1,0,1,2]
            if(nums[i] == nums[i-1]) continue;
            // Find Consecurives
            else if(nums[i] == nums[i-1]+1){
                currCnt ++;
                longest=Math.max(currCnt, longest);

            } 
            // handle non-consecutive Elements -->tc :[1,2,6,7,8]

            else currCnt =1;

        }
    return longest;
        
    }
    public static void main(String[] args) {
        int []nums={2};
        System.out.println(longestConsecutive(nums));
    }
}
