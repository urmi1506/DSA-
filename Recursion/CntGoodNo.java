package Recursion;

public class CntGoodNo {
    public static void main(String[] args) {
        int n=4;
        System.out.println( countGoodNumbers( n));
    }
    static int mod=(int)1e9+7;
    public static int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long x=pow(4,odd)%mod;
        long y=pow(5,even)%mod;
        return (int)((x*y)%mod);
    }

    public static long pow(long x,long y){
        if(y==0){
            return 1;
        }
        long t1=pow(x,y/2);
        if(y%2==0){
            return (t1*t1)%mod;
        }
        else{
            return (x *t1*t1)%mod;
        }
    }
}
