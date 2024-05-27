public class QuickSort {
    public static void main(String[] args) {

        int n = 5;
        int arr[] = { 2, 5, 3, 1, 6 };
        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    static int partition(int arr[], int s, int e) {
        // choose element
        int pivot = arr[s];
        // Find pivotIndex
        int cnt = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot)
                cnt++;
        }
        int pivotInd = s + cnt;
        // place element at right position..swapping
        int temp = arr[pivotInd];
        arr[pivotInd] = arr[s];
        arr[s] = temp;
        // Sort left & right part with cond left<pivot<right
        int i = s;
        int j = e;
        while (i < pivotInd && j > pivotInd) {
            while (i < pivotInd && arr[i] <= pivot) {
                i++;
            }
            while (j > pivotInd && arr[j] > pivot) {
                j--;
            }
            if (i < pivotInd && j > pivotInd) {
                // Swap elements at i and j
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
                j--;
            }
        }
        return pivotInd;
    }

    static void quickSort(int arr[], int s, int e) {
        // base case
        if (s >= e)
            return;

        // partition
        int p = partition(arr, s, e);
        // left part
        quickSort(arr, s, p - 1);
        // right part
        quickSort(arr, p + 1, e);
    }
}
