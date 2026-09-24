package String;

public class RepeatingCharReplacement {
    public static int characterReplacement(String s, int k) {
        int left =0;
        int maxLen =0;
        int maxFreq =0;
        // s consists of only uppercase English letters.
        int[] freq = new int[26];

        // Traverse string
        for(int right=0; right<s.length(); right++){
            // check curr element and add it
            char c = s.charAt(right);
            freq[c-'A']++;
            
            // maxFreq -->replace lessfreq char with maxFreq one
            maxFreq = Math.max(maxFreq ,freq[c-'A']);
            // invalid cond -->windowsize >k
            while((right-left+1) - maxFreq > k){
                // remove element
                freq[s.charAt(left) -'A']--;
                left++;
            }
            // update ans
            maxLen = Math.max(maxLen ,right-left+1);
        }
    return maxLen;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int length = characterReplacement(s, k);
        System.out.println("Length of the longest substring after replacement: " + length);
    }
}
