package String;

public class LengthLongestSubstr {
    public static int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLength=0;
        
        // ascii character
        int freq[] = new int[128];
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            // add curr element
            freq[c]++;
            // invalid cond --duplicate
            while(freq[c] >1){
                // remove element
                freq[s.charAt(left)]--;
                left++;
            }

            maxLength = Math.max(maxLength ,right-left+1);
        }
    return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
