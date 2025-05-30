package Array;

import java.util.Arrays;

public class SecLargeEle {
    public static int secondLargestElement(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-2];
    }
    public static void main(String[] args) {
        int []arr={3,3,6,5};
        System.out.println(secondLargestElement(arr));
    }
}
