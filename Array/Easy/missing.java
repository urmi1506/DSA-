package Easy;

import java.util.Arrays;

public class missing {
    public static int misssingNo(int[]nums){
        int n=nums.length+1;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if(nums[i-1]!=i) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,3,4};
        System.out.println(misssingNo(nums));
    }
}
