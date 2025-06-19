package Medium;

import java.util.HashMap;

public class TwoSum2 {
    public static int[] twoSum(int[]nums ,int target){

        // Array to store ans
        int ans[] = new int[2];
        ans[0] =ans[1] = -1;
        // hashmap 
        HashMap <Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num =nums[i];
            // cal MoreNeeded To reach target
            int moreNeeded = target - num;
            if (map.containsKey(moreNeeded)){
                ans[0] =map.get(moreNeeded);
                ans[1] =i;
            return ans;
            }
            map.put(nums[i],i);
        }
    return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9 ;
        int[]res =twoSum(nums, target);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
