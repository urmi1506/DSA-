package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        int []nums = {1,2,2};
        System.out.println(subsetsWithDup( nums));
    }
      static void print(int[] nums, int n, int ind, List<List<Integer>> ans, List<Integer> output) {
        // Add a copy of output to ans 
        ans.add(new ArrayList<>(output));
        
        for (int i = ind; i < n; i++) {
            // Skip duplicates 
            if (i > ind && nums[i] == nums[i - 1])
                continue;
            
            // Include 
            output.add(nums[i]);
            print(nums, n, i + 1, ans, output);
            
            // Backtrack
            output.remove(output.size() - 1);
        }
    }
    
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        
        Arrays.sort(nums); // handle duplicates
        
        print(nums, nums.length, 0, ans, output);
        
        return ans;
    }
}
