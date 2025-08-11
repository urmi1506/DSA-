package Sorting;

public class MergeTwoSortArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the two arrays first
        int[] merged = mergeArrays(nums1, nums2);
        int n = merged.length;

        // Find median
        if (n % 2 != 0) { // odd
            return merged[n / 2];
        } else { // even
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }

    // Merge two sorted arrays
    private static int[] mergeArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] temp = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        while (i < n) temp[k++] = nums1[i++];
        while (j < m) temp[k++] = nums2[j++];

        return temp;
    }
    public static void main(String[] args) {
        int nums1[] = {1, 3};
        int nums2[] = {2};
        double res=findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }

}
