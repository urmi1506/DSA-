public class OddSeriesSum {
    public static void main(String[] args) {
        long n=2;
        System.out.println(sumOfTheSeries( n));
    }
    static long sumOfTheSeries(long n){
        long sum=0;
         for(long i=1;i<=n;i++)
         {
             sum+=i*i;
         }
         return sum;
     }
}
