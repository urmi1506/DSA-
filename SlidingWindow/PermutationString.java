package SlidingWindow;

import java.util.Arrays;

public class PermutationString {
    public static boolean checkInclusion(String s1, String s2) {
        // Edge case
        if(s1.length() > s2.length()) return false;

        // start pt
        int left =0;
        // freq of both string -->only contain lowercase -->so a-z -->26
        int[] s1Freq = new int [26];
        int[] windowFreq = new int[26];

        // cal freq of s1 string
        for(char c :s1.toCharArray()){
            s1Freq[c - 'a']++;
        }

        // traverse s2
        for(int right=0; right<s2.length(); right++){
            // add new elements
            windowFreq[s2.charAt(right) - 'a']++;

            // check window size reached req size
            if(right -left+1 == s1.length()){
                // check permutation
                if(Arrays.equals(s1Freq ,windowFreq)){
                    return true;
                }
            // remove elements
            windowFreq[s2.charAt(left) - 'a']--;
            left++;
            } 
        }
    return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
