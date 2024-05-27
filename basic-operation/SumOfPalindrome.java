public class SumOfPalindrome {
    public static void main(String[] args) {
      long n=23;
      
      System.out.println(isSumPalindrome(n));  
    }
    static long isSumPalindrome(long n){
      long temp=n; 
      long rev=0,rem,res;
       while(n!=0){
         rem=n%10;
         rev=(rev*10+rem);
         n=n/10;
       }
      res=temp+rev;
      long ans=res;
      long reverse=0;
      
       while(ans!=0){
         rem=ans%10;
         reverse=(reverse*10+rem);
         ans=ans/10; 
        }
        if (reverse==res){
          return 1;
        }
   return -1; 
}
}
