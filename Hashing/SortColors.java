package Hashing;

import java.util.HashMap;

public class SortColors {
   public static void sortColors(int[] nums) {
    // cal freq
       HashMap <Integer,Integer> cnt=new HashMap<>();
       cnt.put(0,0);
       cnt.put(1,0);
       cnt.put(2,0);
       for(int num: nums) cnt.put(num,cnt.get(num)+1);

    // sort
       int idx=0;
       for(int colors=0; colors<3; colors++){
        int freq=cnt.get(colors);
        for(int j=0; j<freq; j++){
            nums[idx]=colors;
            idx++;
        }
       }

    }
    public static void main(String[] args) {
        int []nums = {2,0,2,1,1,0};
        sortColors(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    } 
}
