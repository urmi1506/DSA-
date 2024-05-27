import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
      try(Scanner sc=new Scanner(System.in)){
      int N=sc.nextInt();
      System.out.println(" Enter Size of Array  :"+N);
      
      int []num={72,74,77,33};
      
       for(int i=0;i< N && i<N;i++){
         if( (i&1)== 0){
            System.out.println("Alternative array is:"+num[i]);
        } 
    }
      }
    }
}
/*  if u want to use boolean then u can't  use directly in if condition 
  boolean printAlternate = true;
            for (int i = 0; i < N && i < num.length; i++) 
                if (printAlternate)
*/