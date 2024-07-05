package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class RatMaze {
   public static void main(String[] args) {
    int n = 4;
    int m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}};
         System.out.println(findPath(m, n));
   }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> result = new ArrayList<>();
        backtrack(0, 0, result, "", n, m);
        Collections.sort(result);
        return result;
    }
    
    public static void backtrack(int row, int col, ArrayList<String> result, String temp, int n, int[][] m){
        if(row < 0 || row >= n || col < 0 || col >= n || m[row][col] == 0){
            return;
        }
        if(row == n - 1 && col == n - 1){
            result.add(temp);
            return;
        }
        int origValue = m[row][col];
        m[row][col] = 0;
        
        backtrack(row - 1, col, result, temp + "U", n, m);
        backtrack(row + 1, col, result, temp + "D", n, m);
        backtrack(row, col - 1, result, temp + "L", n, m);
        backtrack(row, col + 1, result, temp + "R", n, m);
        
        m[row][col] = origValue;
    }
}
