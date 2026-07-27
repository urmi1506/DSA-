package Medium;

import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        // Edge case --[]
        if (n == 0) return 0;
        // handle duplicates
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 1;

        for (int num : set) {
            // check starting point
            if (!set.contains(num - 1)) {

                int currNum = num;
                int currCnt = 1;
                // check consecutive
                while (set.contains(currNum + 1)) {
                    currNum++;
                    currCnt++;
                }

                longest = Math.max(longest, currCnt);
            }
        }
    return longest;
    }
    public static void main(String[] args) {
        int[] nums ={100,4,200,1,3,2};

        int Result = longestConsecutive(nums);
        System.out.println(Result);
    }
}
