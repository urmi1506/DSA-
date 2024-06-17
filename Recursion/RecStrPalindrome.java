package Recursion;

public class RecStrPalindrome {
    public static void main(String[] args) {
        String str="abbaaa";
        boolean checkPalindrome =isPalindrome(str,0,str.length()-1);
        System.out.println(checkPalindrome);
        if(checkPalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
    static boolean isPalindrome(String str ,int i,int j){
        if(i>j){
            return true;
        }

        char[] s=str.toCharArray();
        if(s[i]!=s[j]){
            return false;
        }
        else{
            return isPalindrome(str, i+1, j-1);
        }
    }
}
