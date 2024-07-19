import java.util.ArrayList;
import java.util.List;

public class LuckyNo {

    public static List<Integer> minRow(int[][] matrix, int m) {
        List<Integer> minRowVal = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minRowVal.add(min);
        }
        return minRowVal;
    }

    public static List<Integer> maxCol(int[][] matrix, int n) {
        List<Integer> maxColVal = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxColVal.add(max);
        }
        return maxColVal;
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> minRowValues = minRow(matrix, m);
        List<Integer> maxColValues = maxCol(matrix, n);
        List<Integer> luckyNo = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minRowValues.get(i) && matrix[i][j] == maxColValues.get(j)) {
                    luckyNo.add(matrix[i][j]);
                }
            }
        }
        return luckyNo;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };

        LuckyNo ln = new LuckyNo();
        List<Integer> result = ln.luckyNumbers(matrix);
        System.out.println("Lucky numbers: " + result);
    }
}
