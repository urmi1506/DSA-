public class PalindromeSubStr {
    public static void main(String[] args) {
       String s = "amana";
       String res = substring(s);
       System.out.println(res);
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2) {
                return false;
            } else {
                i++;
                j--; 
            }
        }
        return true;
    }

    static String substring(String str) {
        int largestlen = 0;
        String longestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) { 
                String sub = str.substring(i, j); 
                if (isPalindrome(sub)) { 
                    System.out.println(sub);
                    if (sub.length() > largestlen) {
                        largestlen = sub.length();
                        longestPalindrome = sub;
                    }
                }
            }  
        }
        String result = "Longest Palindromic Substring: " + longestPalindrome 
                        + "\nLength of the longest palindromic substring: " + largestlen;
        return result;
    }
}
