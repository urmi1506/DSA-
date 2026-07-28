package Sorting;

public class MedianArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        /*
         * Approach:
         * 1. Merge both sorted arrays into a single sorted array
         *    using the merge step of Merge Sort.
         * 2. After merging:
         *      - If the total number of elements is odd,
         *        the median is the middle element.
         *      - If the total number of elements is even,
         *        the median is the average of the two middle elements.
         */

        int[] merged = merged(nums1, nums2);
        int n = merged.length;

        // If total elements are odd, return the middle element
        if (n % 2 != 0) {
            return merged[n / 2];
        }

        // If total elements are even, return average of middle two elements
        return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
    }

    private static int[] merged(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        // Array to store merged sorted elements
        int[] merged_arr = new int[m + n];

        // left  -> pointer for nums1
        // right -> pointer for nums2
        // k     -> pointer for merged array
        int left = 0;
        int right = 0;
        int k = 0;

        /*
         * Compare elements from both arrays.
         * Store the smaller element in merged array
         * and move the corresponding pointer.
         */
        while (left < m && right < n) {
            if (nums1[left] < nums2[right]) {
                merged_arr[k++] = nums1[left++];
            } else {
                merged_arr[k++] = nums2[right++];
            }
        }

        // Copy remaining elements of nums1 (if any)
        while (left < m) {
            merged_arr[k++] = nums1[left++];
        }

        // Copy remaining elements of nums2 (if any)
        while (right < n) {
            merged_arr[k++] = nums2[right++];
        }

        return merged_arr;
    }


    public static void main(String[] args) {
        int[]nums1 = {1,3}, nums2 = {2};

        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

}

/*TC & Sc O(m+n) */
