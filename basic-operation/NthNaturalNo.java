public class NthNaturalNo {
    static long findNth(long n) {
        long res =0;
        long mult =1;
        while(n>0){
          res = res +(n%9)*mult;
          n =n/9;
          mult =mult*10;
   }
   return res;
    }
    public static void main(String[] args) {
        long n = 9;
        System.out.println(findNth(n));
    }
}
