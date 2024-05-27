public class Remainder {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        System.out.println(findRemainder(num1, num2));
    }
    static int findRemainder(int num1,int num2){
        int rem=num1%num2;
        return rem;
    }
}
