package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicate {

    public static List<List<Integer>> subsetwithDupl(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(nums, 0, temp, ans);
        return ans;
    }

    private static void helper(int[] nums, int idx, List<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp));

        for (int i = idx; i < nums.length; i++) {

            if (i > idx && nums[i] == nums[i - 1]) continue; 

            temp.add(nums[i]);

            helper(nums, i + 1, temp, ans); 

            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] ={1, 2, 2};
        List<List<Integer>> res = subsetwithDupl(nums);

        for (List<Integer> subset : res) {
            System.out.println(subset);
        }
    }
}
