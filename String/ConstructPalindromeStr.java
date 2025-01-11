package String;

public class ConstructPalindromeStr {
    public static boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;

        int bitmask=0;
        for(char ch : s.toCharArray()){
            bitmask ^= (1 << (ch-'a'));

        }
        int oddCnt=Integer.bitCount (bitmask);

        return oddCnt <= k;
    }
    public static void main(String[] args) {
        String s = "annabelle";
        int k = 2 ;
        System.out.println(canConstruct(s, k));
    }
}
