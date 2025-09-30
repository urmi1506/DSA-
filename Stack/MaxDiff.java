

import java.util.Stack;

public class MaxDiff {
    private static int[] leftSmaller(int[] arr, int n) {
        int res[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }

    private static int[] rightSmaller(int[] arr, int n) {
        int res[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
    
    public static int findMaxDiff(int[] arr) {
        int n = arr.length;
        int left[] = leftSmaller(arr, n);
        int right[] = rightSmaller(arr, n);
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, Math.abs(left[i] - right[i]));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 8};
        System.out.println(findMaxDiff(arr));
    }
}


