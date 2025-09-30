

import java.util.Stack;

public class NextGreater {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nextGreater = new int[10001];
        Stack<Integer> s = new Stack<>();
        // we want to find nextGreater right side of arr
        for (int i = n - 1; i >= 0; i--) {
            // pop smaller elements
            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            nextGreater[nums2[i]] = s.isEmpty() ? -1 : s.peek();
            // push bcz it could be nextGreater for other element
            s.push(nums2[i]);
        }
        // copy ans in original array

        for (int i = 0; i < m; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }

        return nums1;
    }
    public static void main(String[] args) {
        int []nums1 = {4,1,2}, nums2 = {1,3,4,2};
        int[] res=nextGreaterElement(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
