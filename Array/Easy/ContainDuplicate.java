package Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(visited.contains(nums[i])){
                return true;
            }
            visited.add(nums[i]);
        }
    return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}
