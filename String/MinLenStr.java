package String;

public class MinLenStr {
    public static int minimumLength(String s) {
        int ans = 0;
        // create array to store freq of each character i.e ascii code of each character
        int[] cnt = new int[26];
    
        // Find frequency of each haracter
        for (final char c : s.toCharArray())
          cnt[c - 'a']++;
    
        // count frequency and add to ans
        for (int i = 0; i < 26; ++i)
          if (cnt[i] > 0)
            ans += cnt[i] % 2 == 0 ? 2 : 1;
    
        return ans;
      }
      public static void main(String[] args) {
         String s = "abaacbcbb";
         System.out.println(minimumLength( s));

         
      }
}
