import java.util.Arrays;

public class ArrayEqualOrNot {
    public static void main(String[] args) {
        int N=5;
        long A[]={1,2,5,4,0};
        long B[]={2,4,5,0,1};
        System.out.println(check( A,B,N));

    }
    public static boolean check(long A[],long B[],int N)
    {
       Arrays.sort(A);
       Arrays.sort(B);
       for (int i = 0; i < N; i++) {
         if(A[i]!=B[i]){
            return false;
         }
       }
    return true;
    }
}
