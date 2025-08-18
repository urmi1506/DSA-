package String;
// GM
public class LongestPalindromeSubStr {
    public static String longestPalindrome(String s) {
        int n=s.length();
        String longest="";

       for(int i=0; i<n; i++){
        // odd cond
        String odd=expandAroundCenter(s,i,i);
        if(odd.length()> longest.length()) longest=odd;

        // even cond
        String even=expandAroundCenter(s,i,i+1);
        if(even.length()> longest.length()) longest=even;
       }

        return longest;
    }
    public static String expandAroundCenter(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}
