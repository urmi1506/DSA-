package String;

import java.util.HashSet;

public class LenOfLongestSubStr {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int l = 0;
        int r = 0;
        HashSet<Character> set = new HashSet<>();

        // Traverse string
        while (r < n) {

            char ch = s.charAt(r);
            // check it visited or not
            if (!set.contains(ch)) {
                set.add(ch);
                r++;
                // maintain maxLen
                maxLen = Math.max(maxLen, r - l);
            } else {
                // if duplicate found remove it
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        int ans = lengthOfLongestSubstring(s);

        System.out.println(ans);
    }
}
