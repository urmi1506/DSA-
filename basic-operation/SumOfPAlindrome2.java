public class SumOfPAlindrome2 {
public static void main(String[] args) {
    long n=23;
    System.out.println(isSumPalindrome(n)); 
}   
    static long isSumPalindrome(long n){
        for(int i=0;i<=5;i++){
            long temp=n; 
          long rev=0,rem=0;
           while(n>0){
             rem=n%10;
             rev=(rev*10+rem);
             n=n/10;
           }
        if (temp==rev){
              return rev;
            }   
          n=temp+rev;
        }
    
       return -1; 
        }
}
/*Given a number, reverse it and add it to itself unless it becomes a palindrome or number of iterations becomes more than 5. */
