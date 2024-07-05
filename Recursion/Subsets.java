package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(subsets( nums));
    }

    static void solve(List<List<Integer>> ans, List<Integer> output, int index, int[] nums) {
        // Base case
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output)); 
            return;
        }

        // Exclude 
        // solve(ans, output, index + 1, nums);

        // Include 
        output.add(nums[index]);
        solve(ans, output, index + 1, nums);

        // Backtrack to remove the current element before moving to the next iteration
        output.remove(output.size() - 1);
        
         // Exclude 
        solve(ans, output, index + 1, nums);
    }

   
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); 
        List<Integer> output = new ArrayList<>(); 
        int index = 0; 
        solve(ans, output, index, nums);
        return ans; 
    }

    
}

