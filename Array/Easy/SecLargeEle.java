package Easy;

import java.util.Arrays;

public class SecLargeEle {
    public static int secondLargestElement(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =n-1; i >=0; i--){
            int largest = arr[n-1];
            if(arr[i] != largest){
                return arr[i];
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int []arr={3,3,6,5};
        System.out.println(secondLargestElement(arr));
    }
}
