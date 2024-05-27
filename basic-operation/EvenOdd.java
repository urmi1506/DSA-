public class EvenOdd {
    public static void main(String[] args) {
        int N=4;
        String ans= oddEven( N);
        System.out.println(ans);
    }
    static String oddEven(int N){
        if(N % 2 == 0){
            return "even";
        }
        else{
            return "odd";
            
        }
    }
}
