package Stack;

public class CelebrityPro2 {
    public static int celebrity(int mat[][]) {
        int top = 0;
        int down = mat.length - 1;

        while (top < down) {
            if (mat[top][down] == 1) {
                // top knows down, so top cannot be the celebrity
                top++;
            } else {
                // top does not know down, so down cannot be the celebrity
                down--;
            }
        }

        // After the loop, 'top' is the potential celebrity
        int candidate = top;

        // Validate the candidate
        for (int i = 0; i < mat.length; i++) {
            if (i != candidate) {
                if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                    return -1; // Candidate knows someone or is not known by someone
                }
            }
        }

        return candidate; 
    }

    public static void main(String[] args) {
        int mat[][] = {{0, 1, 0},
                       {0, 0, 0}, 
                       {0, 1, 0}};
        System.out.println(celebrity(mat)); 
    }
}
