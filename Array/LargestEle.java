package Array;
import java.util.Arrays;
public class LargestEle {
    public static int largestElement(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {
        int[] arr={3,3,6,1};
        System.out.println(largestElement(arr));
    }
}
