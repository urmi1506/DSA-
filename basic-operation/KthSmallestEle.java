import java.util.Arrays;

public class KthSmallestEle {
    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);

        return arr[k - 1];
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}
