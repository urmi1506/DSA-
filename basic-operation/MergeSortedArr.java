import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        int n = 5;
        int arr1[] = {1, 3, 5, 7, 9};
        int m = 3;
        int arr2[] = {2, 4, 6};
        int[] arr3 = new int[n + m];
        
        merge(arr1, n, arr2, m, arr3);
        //sortArray(arr3);
        printArray(arr3, n + m);
    }

    static void merge(int arr1[], int n, int arr2[], int m, int arr3[]) {
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < n) {
            arr3[k] = arr1[i];
            k++;
            i++; 
        }

        while (j < m) {
            arr3[k] = arr2[j];
            k++;
            j++; 
        }
    }

    // static void sortArray(int arr[]) {
    //     Arrays.sort(arr);
    // }

    static void printArray(int res[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
