package Recursion;

public class RecBasic3 {
    static void print(int i,int n){
        //base case
        if(i<1)
        return;
        System.out.println(i);
        print(i-1, n);
    }
    public static void main(String[] args) {
        int n=5;
        print(n,n);
    }
}
