public class PalindromeNo {
    public static void main(String[] args) {
       int no=121;
       int n=no;
       int rev=0,rem; 
      while(n!=0){
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
      }
      if(rev==no){
        System.out.println("palindrome no");
      }
      else{
        System.out.println("Not a palindrome no");
      }
    }
}
