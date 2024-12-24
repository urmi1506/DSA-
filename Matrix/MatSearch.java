package Matrix;
public class MatSearch {
    public static boolean matSearch(int mat[][], int x) {
        for (int[] row : mat) {
           for (int num : row) {
              if(num == x){
                 return true;
              }
           }
           
       }
       return false;
   }
   public static void main(String[] args) {
    int mat[][] = {{18, 21, 27},{38, 55, 67}};
    int x = 55;
    System.out.println(matSearch(mat,x) );
   }

}
