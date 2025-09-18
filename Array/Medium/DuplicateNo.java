package Medium;

import java.util.HashMap;

public class DuplicateNo {
    public static int findDuplicate(int[]nums){
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
        int nums[]={1,3,4,2,2};
        int res =findDuplicate(nums);
        System.out.println(res);
    }
}
