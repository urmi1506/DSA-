
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        int n=4;
        int[] arr={1, 5, 3, 2};
        System.out.println(sortArr(arr,  n));
    }
    static int[] sortArr(int[] arr, int n) 
    { 
       Arrays.sort(arr);
       return arr;
    }
}
