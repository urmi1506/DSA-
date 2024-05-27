 import java.util.ArrayList;
import java.util.List;

public class KeleSpiral {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k=5;
        List<Integer> spiralWave = spiralOrder(matrix,k);
        for (Integer res : spiralWave) {
            System.out.println(res);
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix ,int k) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int row = matrix.length;
        int col = matrix[0].length;

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;

        int count = 0;
        int total = row * col;

        while (count < total) {
            // Traverse top row from left to right
            for (int i = startingCol; i <= endingCol && count < total; i++) {
                // ans.add(matrix[startingRow][i]);
                count++;
                if(count==k){
                    ans.add(matrix[startingRow][i]);
                    return ans;
                }
            }
            startingRow++;

            // Traverse right column from top to bottom
            for (int i = startingRow; i <= endingRow && count < total; i++) {
                // ans.add(matrix[i][endingCol]);
                count++;
                if(count==k){
                    ans.add(matrix[i][endingCol]);
                    return ans;

                }
            }
            endingCol--;

            // Traverse bottom row from right to left
            for (int i = endingCol; i >= startingCol && count < total; i--) {
                // ans.add(matrix[endingRow][i]);
                count++;
                if(count==k){
                    ans.add(matrix[endingRow][i]);  
                    return ans;

                }
            }
            endingRow--;

            // Traverse left column from bottom to top
            for (int i = endingRow; i >= startingRow && count < total; i--) {
                // ans.add(matrix[i][startingCol]);
                count++;
                if(count==k){
                    ans.add(matrix[i][startingCol]);
                    return ans;


                }
            }
            startingCol++;
             
        }
        return ans;
    }
}


