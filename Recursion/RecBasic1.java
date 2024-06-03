package Recursion;
//print name n times
public class RecBasic1{
    static void print(int i, int n){
       //base case
       if(i>n)
       return;
       System.out.println("urmi");
       print(i+1, n);
    }
    public static void main(String[] args) {
        int n=5;
        print(1,n);
    }
}