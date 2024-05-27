public class Greater {
   public static void main(String[] args) {
    int N=8;
    System.out.println(compareFive( N));
   } 
   static String compareFive(int N){
    if(N>5){
        return"Greater than 5";
    }
    else if(N==5){
        return"Equal to 5";
    }
    else{
        return"Lesser than 5";
    }
}
}
