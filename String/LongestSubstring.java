package String;

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
      
        int n= s.length();
        int maxLen = 0;
        int left = 0;
        int right=0;
        HashSet<Character> set = new HashSet<>();

    while(right < n) {
        char ch = s.charAt(right);

        if(!set.contains(ch)){
            set.add(ch);
            right++;
        maxLen = Math.max(maxLen , right-left);
        }

        else{
        set.remove(s.charAt(left));
        left++;
        }
    }
    return maxLen;
  }  
  public static void main(String[] args) {
    String s = "abcabcbb";
    int result = lengthOfLongestSubstring(s);
    System.out.println(result);
  }
}

