public class Factorial {
    public static void main(String[] args) {
      int N=5; 
      System.out.println(factorial( N)); 
    }
    static long factorial(int N){
        // edge case
        if (N == 0 || N == 1)
       {
           return 1;
       }
       int fact=1;
       for (int i = 1; i <= N; i++) {
           fact=fact*i;
       } 
       return fact;
    }
}
