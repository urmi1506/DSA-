import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
      int size=sc.nextInt();
      System.out.println(" Enter Size of Array  :"+size);
      
      int []num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
            System.out.println(num[i]);
        }
         int x;
         System.out.println("Enter search element ");
          x=sc.nextInt();
        for(int j=0;j<size;j++){
        if(x==num[j]){
        System.out.println("Element found at index:"+j);
        /*we take that cond under if it check each element 
          of array with x nd u take x==num den it wrong*/
        }
    }
}
}
}
