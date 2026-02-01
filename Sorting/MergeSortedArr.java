package Sorting;

public class MergeSortedArr {
    public static void main(String[] args) {
        int n = 5;
        int arr1[] = {1, 3, 5, 7,9};
        int m = 3;
        int arr2[] = {2, 4, 6};
        int[] arr3 = new int[n + m];
        
        merge(arr1, n, arr2, m, arr3);
        printArray(arr3, n + m);
    }

    static void merge(int arr1[], int n, int arr2[], int m, int arr3[]) {
        int left = 0, right = 0, k = 0;
        while (left < n && right < m) {
            if (arr1[left] < arr2[right]) {
                arr3[k++] = arr1[left++];
            } else {
                arr3[k++] = arr2[right++];

            }
        }

        while (left < n) {
            arr3[k++] = arr1[left++];
        }

        while (right< m) {
            arr3[k++] = arr2[right++];
        }
    }

    

    static void printArray(int res[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]);
        }
    }
}
