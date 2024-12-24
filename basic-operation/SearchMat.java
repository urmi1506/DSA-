public class SearchMat {
    public static boolean searchMatrix(int[][] mat, int x) {
        for(int[]res :mat){
            for(int num: res){
                if(num == x) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int x = 14;
        System.out.println(searchMatrix(mat, x));
    }
}
