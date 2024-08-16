package Greedy;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MaximumDistance {
    public static int maxDistance(List<List<Integer>> arrays) {
        // min_value and max_value with first & last elements of the first array
        // respectively
        int min_val = arrays.get(0).get(0);
        int max_val = arrays.get(0).get(arrays.get(0).size() - 1);

        int max_dist = 0;

        // iterate all remaining array except 1st array
        for (int i = 1; i < arrays.size(); i++) {
            // store current array
            List<Integer> array = arrays.get(i);

            // Calculate max distances with current array min and max val
            max_dist = Math.max(max_dist, Math.abs(array.get(array.size() - 1) - min_val));
            max_dist = Math.max(max_dist, Math.abs(max_val - array.get(0)));

            // Update min_value and max_value
            min_val = Math.min(min_val, array.get(0));
            max_val = Math.max(max_val, array.get(array.size() - 1));
        }

        return max_dist;
    }

    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        arrays.add(Arrays.asList(1, 2, 3));
        arrays.add(Arrays.asList(4, 5));
        arrays.add(Arrays.asList(1, 2, 3));
        System.out.println(maxDistance(arrays));
    }
}
