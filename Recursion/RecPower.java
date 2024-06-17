package Recursion;

public class RecPower {
    public static void main(String[] args) {
        int a=23;
        int b=3;
        int res=power(a, b);
        System.out.println(res);
    }

    static int power(int a,int b){
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }

        int ans=power(a, b/2);

        if(b%2==0){
            return ans*ans;
        }
        else{
            return a*ans*ans;
        }
    }
}
