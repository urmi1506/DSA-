import java.util.Arrays;

public class KEleTwoArr {
     public static long kthElement(int k, int arr1[], int arr2[]) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        
        Arrays.sort(mergedArr);
        
        return mergedArr[k-1];
    }
    public static void main(String[] args) {
        int k = 5;
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        System.out.println(kthElement(k, arr1, arr2));
    }
}
