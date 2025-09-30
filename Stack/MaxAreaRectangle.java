
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaxAreaRectangle {

    static long[] nrstSmallerlft(long arr[], int n) {
        Stack<long[]> s = new Stack<>();
        ArrayList<Integer> left = new ArrayList<>();
        int pseudoInd = -1;

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && s.peek()[0] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                left.add(pseudoInd);
            } else {
                left.add((int) s.peek()[1]);
            }
            s.push(new long[]{arr[i], i});
        }

        // Convert ArrayList to array
        long[] leftInd = new long[n];
        for (int i = 0; i < n; i++) {
            leftInd[i] = left.get(i);
        }

        return leftInd;
    }

    static long[] nrstSmallerRght(long arr[], int n) {
        Stack<long[]> s2 = new Stack<>();
        ArrayList<Integer> right = new ArrayList<>();
        int pseudoInd = n;

        for (int i = n - 1; i >= 0; i--) {
            while (!s2.isEmpty() && s2.peek()[0] >= arr[i]) {
                s2.pop();
            }
            if (s2.isEmpty()) {
                right.add(pseudoInd);
            } else {
                right.add((int) s2.peek()[1]);
            }
            s2.push(new long[]{arr[i], i});
        }

        // Convert ArrayList to array and reverse it
        long[] rightInd = new long[n];
        Collections.reverse(right);
        for (int i = 0; i < n; i++) {
            rightInd[i] = right.get(i);
        }

        return rightInd;
    }

    static long maxHistogramArea(long[] arr, int n) {
        long[] leftInd = nrstSmallerlft(arr, n);
        long[] rightInd = nrstSmallerRght(arr, n);

        long maxArea = 0;

        for (int i = 0; i < n; i++) {
            long width = rightInd[i] - leftInd[i] - 1;
            long area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    static long maxRectangle(long[][] arr, int n, int m) {
        long maxArea = 0;
        long[] hist = new long[m];

        for (int j = 0; j < m; j++) {
            hist[j] = arr[0][j];
        }

        maxArea = maxHistogramArea(hist, m);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    hist[j] = 0;
                } else {
                    hist[j] += arr[i][j];
                }
            }
            maxArea = Math.max(maxArea, maxHistogramArea(hist, m));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        long[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };
        int n = matrix.length;
        int m = matrix[0].length;

        long maxRectangleArea = maxRectangle(matrix, n, m);
        System.out.println("Maximum area of rectangle in the matrix: " + maxRectangleArea);
    }
}
