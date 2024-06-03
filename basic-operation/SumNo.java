public class SumNo {
    public static void main(String[] args) {
        int a= 123;
        int b=567 ;
        int c= 253 ;
        int result =calcSum(a, b, c);
        System.out.println("The sum of the numbers is: " + result);
    }
    static int calcSum(int a, int b, int c)    
{
    return a+b+c;
}
}
