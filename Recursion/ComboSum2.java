package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComboSum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5}; 
        int target = 8;
        System.out.println(combinationSum2( candidates,  target));
    }
    private static List<List<Integer>> res = new ArrayList<>(); 

    public static void solve(int[] nums, int target, int index, List<Integer> list) {
        
        if (target == 0) {
            List<Integer> temp = new ArrayList<>();
            for (int j : list) {
                temp.add(j);
            }
            res.add(temp); 
            return;
        }
        
        if (index == nums.length || target < nums[index]) {
            return;
        }
        
        int temp = nums[index];
        list.add(nums[index]); 
        solve(nums, target - nums[index], index + 1, list); 
        list.remove(list.size() - 1); 
        
        int i = 1;
        while (index + i < nums.length && nums[index + i] == temp) {
            i++; 
        }
        solve(nums, target, index + i, list); 
        return;
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        solve(candidates, target, 0, new ArrayList<>()); 
        return res; 
    }
}
