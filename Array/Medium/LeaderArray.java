package Medium;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderArray {
    public static ArrayList<Integer> leaders(int []nums){
        int n=nums.length;
        // store leaders
        ArrayList<Integer>list=new ArrayList<>();

        // rightmost element always leader
        int rightmost=nums[n-1];
        list.add(rightmost);

        for (int i = n-2; i >= 0; i--) {
            if(nums[i]>=rightmost){
                rightmost=nums[i];
                list.add(rightmost);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int []nums = {1, 2, 5, 3, 1, 2};
        ArrayList<Integer> res = leaders(nums);
        for (Integer ans : res) {
            System.out.println(ans);
        }
        
    }
}
