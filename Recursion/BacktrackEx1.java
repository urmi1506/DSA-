package Recursion;

public class BacktrackEx1 {
    static void print(int i,int n){
        //base case
        if(i<1)
        return;
        print(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        print(n,n);
    }
}
