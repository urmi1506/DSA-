package String;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // Edge case
        if(s.length() != t.length()) 
           return false;

        // sort string
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);

        // compare
        return Arrays.equals(sSort ,tSort);
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram" ;

        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }
}
