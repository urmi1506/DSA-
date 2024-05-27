import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
           
        //PrintCount function is void(mean no return type) so we can't able to print using sout here
            PrintCount(n);
        }

         
    }
     static void PrintCount(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
