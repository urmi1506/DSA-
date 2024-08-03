package Stack;

public class CelebrityPro1 {
    public static int celebrity(int mat[][]) {
        int n = mat.length;
        int[] knownMe = new int[n];
        int[] iKnown = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    iKnown[i]++;
                    knownMe[j]++;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (knownMe[i] == n - 1 && iKnown[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int mat[][] = {{0, 1, 0},
                       {0, 0, 0}, 
                       {0, 1, 0}};
        System.out.println(celebrity(mat));
    }
}
