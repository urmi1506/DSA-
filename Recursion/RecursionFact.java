package Recursion;

public class RecursionFact {
    public static void main(String[] args) {
        int n=3;
        int ans=fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==0)
        return 1;
        int smallproblem=fact(n-1);
        int bigproblem=n*smallproblem;
        return bigproblem; 
    }
}
