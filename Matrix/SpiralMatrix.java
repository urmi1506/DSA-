package Matrix;

import java.util.ArrayList;

public class SpiralMatrix {
    public static ArrayList<Integer> spirallyTraverse(int mat[][]) {
       ArrayList<Integer> res = new ArrayList<>();
        if (mat == null || mat.length == 0) return res;

        int row = mat.length;
        int col = mat[0].length;

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;

        int cnt = 0;
        int total = row * col;

        while (cnt < total) {
            // Traverse top row from left to right
            for (int i = startingCol; i <= endingCol && cnt < total; i++) {
                res.add(mat[startingRow][i]);
                cnt++;
            }
            startingRow++;

            // Traverse right column from top to bottom
            for (int i = startingRow; i <= endingRow && cnt < total; i++) {
                res.add(mat[i][endingCol]);
                cnt++;
            }
            endingCol--;

            // Traverse bottom row from right to left
            for (int i = endingCol; i >= startingCol && cnt < total; i--) {
                res.add(mat[endingRow][i]);
                cnt++;
            }
            endingRow--;

            // Traverse left column from bottom to top
            for (int i = endingRow; i >= startingRow && cnt < total; i--) {
                res.add(mat[i][startingCol]);
                cnt++;
            }
            startingCol++;
        }
        return res;
    }
     public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        ArrayList<Integer> spiralWave = spirallyTraverse( mat) ;
        for (Integer res : spiralWave) {
            System.out.println(res);
        }
    }
}
