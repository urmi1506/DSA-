package Matrix;

import java.util.ArrayList;

public class SetsMatrix {
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int m = a.get(0).size();
        
        int[] markRow = new int[n];
        int[] markCol = new int[m];
        
        for(int row = 0; row < n; row++){
            for(int col=0; col<m; col++){
                if(a.get(row).get(col) ==0){
                    markRow[row] = 1;
                    markCol[col] = 1;
                }
            }
        }
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(markRow[row] ==1 || markCol[col] == 1) a.get(row).set(col,0);
            }
        }
	}
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>a = new ArrayList<>();
        
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(1);
        row1.add(1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(0);
        row2.add(1);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(1);
        row3.add(1);
        row3.add(1);

        a.add(row1);
        a.add(row2);
        a.add(row3);

        setZeroes(a);

        for (ArrayList<Integer> row : a) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
