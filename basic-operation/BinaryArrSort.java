import java.util.Arrays;
public class BinaryArrSort {
    public static void main(String[] args) {
       int N= 5 ;
       int A[] ={1 ,0 ,1 ,1 ,0};
       binSort( A,  N);
       for (int i = 0; i < N; i++) {
          System.out.println(A[i]);
       }
    }
    static void binSort(int A[], int N)
    {
          Arrays.sort(A);
    }
}
