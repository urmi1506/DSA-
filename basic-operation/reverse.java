import java.util.Scanner;

public class reverse {
    
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();

        int reversedno= ReverseNO(n);
            System.out.println("reverse no\n"+reversedno);
        }
    }
         
        
        public static int ReverseNO(int n){
            int ans=0;
            
            while(n!=0){
         int a = n%10;
         if((ans>Integer.MAX_VALUE/10)||(ans<Integer.MIN_VALUE/10)){
            //In java we can't declare directly INT_MAX or INT_MIN it declare as above
            /*[-2 pow 31,2 pow 31 -1] if any no not lie between this range then return 0 soo we 
             get above range whn ans*10 that why we take MAX_VAL/10
            */
            return 0;
        }
         
           ans=(ans*10)+a;
           n =n/10;
            }
           return ans;


    }
     
}  


