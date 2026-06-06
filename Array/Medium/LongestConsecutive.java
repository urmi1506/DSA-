package Medium;

import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 1;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int currNum = num;
                int currCnt = 1;

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
