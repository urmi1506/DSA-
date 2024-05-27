import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int n=4;
        int arr[] = {1, 5, 3, 2};
        System.out.println(sortArr( arr,  n));
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] sortArr(int[] arr, int n) 
    { 
         Arrays.sort(arr);
        return arr;
    }
}
