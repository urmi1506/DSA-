package Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Leader2{
    public static ArrayList<Integer> leaders(int[] nums) {
        int n = nums.length;

        ArrayList <Integer> ans =new ArrayList<>(n);
        int rightmostEle= nums[n-1];
        ans.add(rightmostEle);

        // Find Rightmost Elements
        for (int i = n-2; i >= 0 ; i--) {
            if(nums[i] > rightmostEle){
                rightmostEle=nums[i];
                ans.add(rightmostEle);

            }
        }
    // to maintain order
    Collections.reverse(ans);
    return ans;
    }
    public static void main(String[] args) {
        int []nums = {1, 2, 5, 3, 1, 2};
        ArrayList<Integer> res = leaders(nums);
        for (Integer ans : res) {
            System.out.println(ans);
        }
        
    }
}

