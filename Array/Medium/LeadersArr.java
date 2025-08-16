package Medium;

import java.util.ArrayList;

public class LeadersArr {
    public static ArrayList<Integer>leaders(int []nums){
        int n=nums.length;
        // store a leader
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isLeader=true;
            for (int j = i+1; j < n; j++) {
                if(nums[i]<nums[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader) list.add(nums[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int []nums={16,17,4,3,5,2};
        ArrayList <Integer>res=leaders(nums);
        for (Integer ans : res) {
            System.out.println(ans);
        }
    }
}
