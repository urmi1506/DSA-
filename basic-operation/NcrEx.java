import java.util.Scanner;

public class NcrEx {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            System.out.println("Enter n:"+n);
            int r=sc.nextInt();
            System.out.println("Enter r:"+r);
            
            System.out.println("Answer is:"+Ncr(n,r));

        }
    
    }
    static int Factorial(int num){
      int fact=1;
      for(int i=1;i<=num;i++){
       fact=fact*i;
      }
      return fact;

    }
    static int Ncr(int n,int r){
        int nume=Factorial(n);
        int  denome=Factorial(r)*Factorial(n-r);
        int ans=nume/denome;
        return ans;
    }
    
}
