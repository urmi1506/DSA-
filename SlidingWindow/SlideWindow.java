package SlidingWindow;
import java.util.HashMap;
import java.util.Map;

public class SlideWindow {

    // Function to find the smallest window in the string `s` consisting
    // of all the characters of string `p`.
    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) {
            return "-1"; // If `s` is smaller than `p`, there's no valid window.
        }

        // Frequency map for string `p`.
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String ans = "-1"; // Stores the smallest window.
        int minLength = s.length() + 1; // To keep track of the smallest window length.
        int l = 0; // Left pointer of the window.
        int matchedChars = 0; // Counts how many characters have matched the required frequency.

        // Map to store the frequency of characters in the current window.
        Map<Character, Integer> windowMap = new HashMap<>();

        // Expand the window with the right pointer `r`.
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            // If the current character is part of `p`, update the window map.
            if (map.containsKey(ch)) {
                windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

                // If the frequency of the character in the window matches the required frequency.
                if (windowMap.get(ch).equals(map.get(ch))) {
                    matchedChars++;
                }
            }

            // Shrink the window from the left side if all characters are matched.
            while (matchedChars == map.size()) {
                // Update the smallest window if necessary.
                if (r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    ans = s.substring(l, r + 1);
                }

                // Try to shrink the window from the left.
                char leftChar = s.charAt(l);
                if (map.containsKey(leftChar)) {
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                    // If the character frequency in the window is now less than required, reduce the matched count.
                    if (windowMap.get(leftChar) < map.get(leftChar)) {
                        matchedChars--;
                    }
                }
                l++; // Move the left pointer.
            }
        }

        return ans.equals("-1") ? "-1" : ans; 
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String p = "ABC";
        System.out.println(smallestWindow(s, p)); 
    }
}


