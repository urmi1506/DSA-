package String;

public class Transformation {
     static final int MOD = 1_000_000_007;
    
    public static int lengthAfterTransformations(String s, int t) {
        int[] freq = new int[26];
        long res = s.length();
        int z = 25;
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        while (t-- > 0) {
            res = (res + freq[z]) % MOD;
            freq[(z + 1) % 26] = (int)((freq[(z + 1) % 26] + (long)freq[z]) % MOD);
            z = (z + 25) % 26;
        }
        return (int)res;
    }
    public static void main(String[] args) {
        String s = "abcyy";
        int  t = 2 ;
        System.out.println(lengthAfterTransformations( s, t));
    }
}
