public class MergeSortArr2 {
    public static void main(String[] args) {
        int m = 3;
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int n = 3;
        int nums2[] = {2, 5, 6};
        merge(nums1, m, nums2, n);
        printArray(nums1, m + n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }
        
        // Copy merged arr to nums1
        for (i = 0; i < m + n; i++) {
            nums1[i] = mergedArray[i];
        }
    }

    static void printArray(int res[], int n) {
        
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
