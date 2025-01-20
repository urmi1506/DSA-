package Matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CompleteInx {
      public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        Map<Integer, int[]> positionMap = new HashMap<>();
        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];
        Arrays.fill(rowCount, cols);
        Arrays.fill(colCount, rows);
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c) {
                positionMap.put(mat[r][c], new int[]{r, c});
            }
        }
        for (int idx = 0; idx < arr.length; ++idx) {
            int[] pos = positionMap.get(arr[idx]);
            if (--rowCount[pos[0]] == 0 || --colCount[pos[1]] == 0) {
                return idx;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr = {1,3,4,2};
       int[][] mat = {{1,4},{2,3}};
       System.out.println(firstCompleteIndex(arr, mat));
    }
}
