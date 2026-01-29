package Easy;

import java.util.*;

public class MinabsDiff {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff < minDiff) {
                minDiff = diff;
                res = new ArrayList<>();
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            } 
            else if (diff == minDiff) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};

        List<List<Integer>> res = minimumAbsDifference(arr);

        
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }
}
