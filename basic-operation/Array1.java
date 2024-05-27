import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
      try(Scanner sc=new Scanner(System.in)){
      int size=sc.nextInt();
      System.out.println(" Enter Size of Array  :"+size);
      
      int []num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
            System.out.println(" Enter Array :"+num[i]);
        }
       for(int j=0;j<size;j++){
            System.out.println("Array is:"+num[j]);
        } 
      }
    }
}
