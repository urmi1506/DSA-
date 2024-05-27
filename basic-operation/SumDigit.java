public class SumDigit {
    public static void main(String[] args) {
      int N=12;
      System.out.println(sumOfDigits(N));  
    }
    static int sumOfDigits(int N) {
        int rem,sum=0;
       while(N!=0){
          rem=N%10;
          sum=sum+rem;
          N=N/10;
          
       } 
       
       return sum;  
    }
    
}
