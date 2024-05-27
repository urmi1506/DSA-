import java.util.*;
public class EvenOrOdd{
    public static void main(String[] args) {
        
    try (Scanner sc = new Scanner(System.in)) {
    
    int num1=sc.nextInt();
    System.out.println("Enter number:"+num1);
    System.out.println("No is:"+isEven(num1));
    }
   // isEven (25);
     
    
}
    static boolean isEven(int a){
        if((a & 1)==1){
            return false;
        }
        else{
            return true;
            
        }
    }

}
