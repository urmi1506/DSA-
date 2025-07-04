package Easy;

import java.util.HashSet;

public class RemDupli {
    public static int removeDuplicates(int[] nums) {
       int n =nums.length;
       HashSet<Integer> set =new HashSet<>();
       for (int num : nums) {
          set.add(num);
       }
    return set.size();
    }
    public static void main(String[] args) {
        int[] nums={3,3,5,6};
        System.out.println(removeDuplicates(nums));

    }
}
