package Basic;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int rev=0;
        // if not use temp it lost real x val
        int temp=x;
        if(x <0) return false;
        while(temp != 0){
            // digit
            int rem= temp % 10;
            // reverse no
            rev = (rev * 10) +rem;
            // remove last digit
            temp /=10; 
        }
        if(rev == x) return true;
        else return false;
    }
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
}
