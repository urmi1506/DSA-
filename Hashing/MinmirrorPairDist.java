package Hashing;

import java.util.HashMap;

public class MinmirrorPairDist {
    public static int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min_dist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // check is curr ele +nt int map
            if(map.containsKey(nums[i])){
                // cal min dist by comparing minDist & abs-dist
                //abs dist = i - map.get(nums[i])
                min_dist = Math.min(min_dist , i - map.get(nums[i]));
            }
            // if curr ele not +nt in map
            // cal rev of curr elem
            int rev = reverse(nums[i]);
            // put rev no and idx of it in map 
            map.put(rev , i);
        }
        
        return min_dist == Integer.MAX_VALUE ? -1 : min_dist;
    }

    private static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] nums = {120 ,21};
        // [21 , 120] ,(duplicate + mirror no) [11 , 11 ,11] ,(duplicate + No mirror no)[12 ,12 ,12] --edge cases
        int minDist = minMirrorPairDistance(nums);
        System.out.println(minDist);
        
    }

}
