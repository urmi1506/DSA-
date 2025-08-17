package Medium;

import java.util.HashSet;
import java.util.Set;

public class LongConsecutive2 {

    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int start : set) {
            // if 'it' is a starting number
            if (!set.contains(start - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = start;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt ++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println(ans);
    }
}




