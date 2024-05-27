import java.util.*;
public class CalculatorEx{
    public static void main (String args[]){
        int a,b;
        char op;
        int c,p,x,y,z;
        try (Scanner sc = new Scanner(System.in)) {
        a=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter val of a:"+a);
         
         b=sc.nextInt();
         sc.nextLine();
         //this is necessary bcz compiler can't understand the ip behave strange
         System.out.println("Enter val of b:"+b);
          
         op=sc.nextLine().charAt(0);
            //if u don't use charAt den give error
        System.out.println("Enter character:"+op);
         
        }
        
        switch (op) {
            case '1':
             c=a+b;
            System.out.println("Addition:"+c);
                break;
                case 'b':
             p=a-b;
            System.out.println("Substraction:"+p);
                break;
                case '3':
            x=a*b;
            System.out.println("Multiplication:"+x);
                break;
                case '4':
             if(b!=0){
            //we take above condition bcz if u take b=0 then it give error /by zero
                y=a/b;
            System.out.println("Division:"+y);}
            else{
                System.out.println("Null Error");
            }
                break;
                case '5':
             z=a%b;
            System.out.println("Remainder:"+z);
                break;
        
            default:
            System.out.println("None");
                break;
        }

    }
}