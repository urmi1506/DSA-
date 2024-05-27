public class MaximumMoney {
    public static void main(String[] args) {
        int N=5;
        int K=10;
        System.out.println(maximizeMoney( N ,  K));
    }
    static int maximizeMoney(int N , int K) {
         int sum=0;   //i+2
         for (int i = 0; i < N; i+=2) {
            sum+=K;
         }
         return sum;
    }
}
