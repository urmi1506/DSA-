package Recursion;

public class SummationNo {
    //by functional way
    public static void main(String[] args) {
        int n=5;
        int ans=print(n);
        System.out.println(ans);
    }
    static int print (int n){
        //base case
        if(n==0)
        return 0;
        return n+print(n-1);

    }
}
