package Medium;

import java.util.HashMap;

public class SubArrSumK2 {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}
