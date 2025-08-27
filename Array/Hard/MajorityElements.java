package Hard;
import java.util.*;
public class MajorityElements { 
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        // cnt freq
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // check cnt > n/3
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                result.add(key);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int []nums={1,2};
        List<Integer> ans=majorityElement(nums);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}


