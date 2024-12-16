import java.util.Arrays;

public class KthEle {
    public static int kthElement(int a[], int b[], int k) {
        int[] mergedArr = new int[a.length + b.length];
        System.arraycopy(a, 0, mergedArr, 0, a.length);
        System.arraycopy(b, 0, mergedArr, a.length, b.length);
        
        Arrays.sort(mergedArr);
        
        return mergedArr[k-1];
    }
    public static void main(String[] args) {
       int  a[] = {2, 3, 6, 7, 9}, b[] = {1, 4, 8, 10}, k = 5;
       System.out.println(kthElement(a, b, k) );
    }
}
