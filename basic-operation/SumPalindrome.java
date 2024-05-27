public class SumPalindrome {
    public static void main(String[] args) {
      int N=56;
      System.out.println(isDigitSumPalindrome(N));  
    }
    static int isDigitSumPalindrome(int N) {
      int sum=0;
      int i;
      while(N>0){
        i=N%10;        
        N=N/10;
        sum+=i;
      }
      System.out.println(sum);
      
        int t1=sum;
        int rev=0,rem; 
       while(t1!=0){
         rem=t1%10;
         rev=(rev*10)+rem;
         t1=t1/10;
      }
      System.out.println(rev);
      if(rev==t1){
        return 1;
      } 
     return 0;  
    }
    
}

