package SlidingWindow;

public class MinWindowSubStr {
    public static String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        // start pt -->string
        int left=0;
        // req character
        int required =t.length();
        // want minSubstring
        int minLen = Integer.MAX_VALUE;
        // start pt -->substr
        int start=0;
        // both str contain ->upper&lowecase letters
        int freq[] = new int[128];

        for(char c : t.toCharArray()){
            freq[c]++;
        }

        for(int right=0; right<s.length(); right++){
            // add new element
            char c = s.charAt(right);

            // check curr char matches req one 
            if(freq[c] >0){
                required--;
            }
            freq[c]--;

            // valid window
            while(required == 0){
                // update ans
                if(right-left +1 <minLen){
                    minLen =right-left+1;
                    start=left;
                }
                // remove left element-->shrink
                char charLeft = s.charAt(left);
                freq[charLeft]++;

                // check remove character req or not
                if(freq[charLeft] > 0){
                    required++;
                }
                left++;
            }
        }
        // no valid substring found
        if(minLen == Integer.MAX_VALUE) return "";

    return s.substring(start ,start+minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}