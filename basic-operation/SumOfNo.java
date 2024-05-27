public class SumOfNo {
    static long seriesSum(int n) {
long sum=((long)(n)*(n+1))/2; 
       
      return sum;
   }
   public static void main(String args[]){
       
       long ans=seriesSum(5);
       System.out.println("Sum of no:"+ans);
   }
}
