public class CntPair1 {

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1)
            arr[k++] = leftArr[i++];
        while (j < n2)
            arr[k++] = rightArr[j++];
    }

    static int countPairs(int[] arr, int target) {
        mergeSort(arr, 0, arr.length - 1);

        int left = 0, right = arr.length - 1;
        int cnt = 0;

        while (left < right) {
            if (arr[left] + arr[right] < target) {
                cnt += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 5, 3 };
        int target = 8;
        System.out.println(countPairs(arr, target));
    }
}
