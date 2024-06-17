public class FibonacciNo {
    public static void main(String[] args) {
        int n = 4;
        long[] result = printFibb(n);
        
        for (long num : result) {
            System.out.println(num);
        }
    }
//    The first two number of the series are 1 and 1.
    public static long[] printFibb(int n) 
    {
         long[] fibNo = new long[n];
        long t1 = 0, t2 = 1;

        for (int i = 0; i < n; i++) {
            fibNo[i] = t2;
            long t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }

        return fibNo;
    }
}
