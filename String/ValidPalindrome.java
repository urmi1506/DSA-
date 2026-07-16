package String;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Edge Case --> null i/p
        if(s == null)
           return true;

        int low =0;
        int high = s.length() - 1;

        while(low <= high){
            char first = s.charAt(low);
            char last = s.charAt(high);
            // skip alphanumeric of left
            if(!Character.isLetterOrDigit(first)){
                low++;
            }
            // skip alphanumeric of right
            else if(!Character.isLetterOrDigit(last)){
                high --;
            }
            // compare
            else {
                if(Character.toLowerCase(first) != Character.toLowerCase(last)){
                return false;

                }
                low++;
                high--;
            }
              
        }
    return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
