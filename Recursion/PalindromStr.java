package Recursion;

public class PalindromStr {
    public static void main(String[] args) {
        int n=5;
        String s="NAYAN";
        System.out.println(isPalindrome(s, 0, n));
    }
    static boolean isPalindrome(String s,int i,int n){
        char[] c=s.toCharArray();
        //base case
        if(i >= n/2)
        return true;

        if(c[i] != c[n-i-1])
        return false;

        return isPalindrome(s, i+1, n);


    }
}
