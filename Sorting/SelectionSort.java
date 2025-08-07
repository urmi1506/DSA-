package Sorting;
public class SelectionSort {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {6, 2, 8, 4, 10};
        selectionSort(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int arr[], int n) {
        // Find min element and then swap it
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t1 = arr[min];
            arr[min] = arr[i];
            arr[i] = t1;
        }
    }
}
