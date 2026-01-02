package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class RepeateNo {
    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int ans=-1;
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
            if(freq.get(num)>1) {
                ans=num;
                break;
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,3};
        System.out.println(repeatedNTimes(nums));
    }
}
