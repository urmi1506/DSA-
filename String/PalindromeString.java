package String;

public class PalindromeString {
    public static boolean isPalindrome(String s,int left,int right){
        while(left<right){
        if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

    return true;

    }
    public static void main(String[] args) {
        String s="abaaa";
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
}
