package Medium;

import java.util.*;

public class SumDist{
    public static long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        // Group indices by value
        Map<Integer, List<Integer>> d = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            d.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        // Process each group independently
        for (var idx : d.values()) {
            int m = idx.size();

            // left = sum of distances to ele BEFORE curr idx
            long left = 0;

            // right = sum of distances to ele AFTER curr idx
            long right = -1L * m * idx.get(0);
            for (int i : idx) {
                right += i;
            }

            // Iterate through indices of this group
            for (int i = 0; i < m; ++i) {

                // Total distance = left side + right side
                ans[idx.get(i)] = left + right;

                //  Move from idx[i] → idx[i+1]
                if (i + 1 < m) {

                    // Gap between consecutive indices
                    int gap = idx.get(i + 1) - idx.get(i);

                    // Update LEFT:
                    // All (i+1) elements on left become farther by gap --increase distance
                    left += gap * (i + 1L);

                    // Update RIGHT:
                    // All remaining elements become closer by gap --decrease dist
                    right -= gap * (m - i - 1L);
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,1,1,2};
        long[] sum_of_dist =distance(nums);
        for (long l : sum_of_dist) {
            System.out.println(l);
        }
    }
}