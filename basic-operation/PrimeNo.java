import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            if(n<2){
                System.out.println("non prime number");
                
            }
            else if(isPrime(n)==true){
                System.out.println("Prime No");
            }

            else{

                System.out.println("Non prime No");
            }
        }
    }
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
        //if cond is true den its non prime no
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
