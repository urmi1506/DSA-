public class ArmstrongNo {
    public static void main(String[] args) {
        int n=153;
       System.out.println( armstrongNumber(n));
    }
    static String armstrongNumber(int n){
       int t1=n;
       int leng=0;
       while(t1!=0){
        t1=t1/10;
        leng=leng+1;
       }
       int t2=n;
       int arm=0;
       int rem;
       while(t2!=0){
        rem=t2%10;
        int mult=1;
        for (int i = 0; i < leng; i++) {
            mult=mult*rem;
        }
        arm=arm+mult;
        t2=t2/10;
       }
    if (n==arm){
        return "Yes";
    }
    return "No";
    }
    
}
