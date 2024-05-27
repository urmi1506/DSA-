public class Mean {
    public static void main(String[] args) {
      int N=4;
      int[] A={56,67,30,79}  ;
      System.out.println(mean( N ,  A)); 
    }
    static int mean(int N , int[] A) {
        int sum=0,mean;
        for (int i = 0; i < N; i++) {
            sum+=A[i];
        }
        mean=sum/N;
        return mean;
    }
}
