package Easy;

import java.util.Arrays;

public class SingleNo2 {
    public static int singleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-1;i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
     return nums[n-1];
    }
    public static void main(String[] args) {
        int[] nums={2,2,1};
        System.out.println(singleNumber(nums));
    }
}
