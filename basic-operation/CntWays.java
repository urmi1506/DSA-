public class CntWays {

    public static int nthStair(int n) {
          int res = 1;
        
        while(n > 1) {
            res += 1;
            n -= 2;
        }
        
        return res;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(nthStair( n));
    }
}

