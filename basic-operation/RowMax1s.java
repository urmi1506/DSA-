public class RowMax1s {
 
    public static int rowWithMax1s(int arr[][]) {
      for (int column = 0; column < arr[0].length; column++) {
          
        for (int row = 0; row < arr.length; row++) {
            
          if (arr[row][column] == 1) return row;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
               {0, 0, 1, 1},
               {1, 1, 1, 1},
               {0, 0, 0, 0}};
               System.out.println(rowWithMax1s(arr) );
    }
}

