public class palindrome {
   public static void main(String[] args) {
    int n=555;
    System.out.println(is_palindrome( n));
   } 
   public static String is_palindrome(int n)
    {
        int t1=n;
       int rev=0,rem; 
      while(t1!=0){
        rem=t1%10;
        rev=(rev*10)+rem;
        t1=t1/10;
      }
      if(rev==n){
        return "Yes";
      }
      return "No";
    }
}
