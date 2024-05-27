public class RecMergeSort {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 72, 23, 74, 21, 77 };
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    static void mergeSort(int arr[], int s, int e) {
        // Base case
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        // sort left part
        mergeSort(arr, s, mid);
        // sort right part
        mergeSort(arr, mid + 1, e);
        // merge both
        merge(arr, s, e);
    }

    static void merge(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;
        // create two array
        int len1 = mid - s + 1;
        int len2 = e - mid;  

        int[] first = new int[len1];
        int[] sec = new int[len2];

        // copy values

        // 1 array
        int mainArrInd = s;
        for (int i = 0; i < len1; i++) {
            first[i] = arr[mainArrInd++];
        }
        // 2 array
        mainArrInd = mid + 1;  
        for (int i = 0; i < len2; i++) {
            sec[i] = arr[mainArrInd++];
        }

        // merge both array
        int ind1 = 0;
        int ind2 = 0;

        mainArrInd = s;
        while (ind1 < len1 && ind2 < len2) {
            if (first[ind1] <= sec[ind2]) { 
                arr[mainArrInd++] = first[ind1++];
            } else {
                arr[mainArrInd++] = sec[ind2++];
            }
        }

        // 1st array
        while (ind1 < len1) {
            arr[mainArrInd++] = first[ind1++];
        }
        // 2 nd array
        while (ind2 < len2) {
            arr[mainArrInd++] = sec[ind2++];
        }
    }
}
