package Medium;

import java.util.HashMap;

public class MaxEle2 {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int maxCnt=0;
        int cnt =1; 
        int majorityEle=nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(majorityEle)) cnt ++;
            if(cnt > maxCnt){
                maxCnt = cnt ;
                majorityEle=nums[i];
            }
        }
    return majorityEle;
    }
     public static void main(String[] args) {
        int[]nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
