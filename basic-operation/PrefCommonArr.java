public class PrefCommonArr {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        // create an arr to store ans
        int[] ans = new int[n];
        // create arrays to store count freq
        int cntA[] = new int[n + 1]; // n+1...1 based indexing to track whole arr freq
        int cntB[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            // cal freq
            cntA[A[i]]++;
            cntB[B[i]]++;
            for (int j = 1; j <= n; j++) {
                // use min function to ensure correct frequency
                ans[i] += Math.min(cntA[j], cntB[j]);

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 2, 4 }, B = { 3, 1, 2, 4 };
        int[] res = findThePrefixCommonArray(A, B);
        for (int result : res) {
            System.out.println(result);
        }

    }
}