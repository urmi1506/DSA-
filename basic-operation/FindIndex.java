public class FindIndex {
    public static void main(String[] args) {
        int N = 6;
        int a[] = { 1, 2, 3, 4, 5, 5 };
        int key = 5;
        int ans[] = (findIndex(a, N, key));

        for (int ind : ans) {
            System.out.println(ind);
        }

    }

    static int[] findIndex(int a[], int N, int key) { /*  (-1 indicates index not found) it means intially d ind is not found*/
                                                      
        int res[] = { -1, -1 };
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                // [1] indicate first occurrence of the key
                res[1] = i;
            }

        }
        for (int i = N - 1; i >= 0; i--) {
            if (a[i] == key) {
                // [0] indicate first occurrence of the key
                res[0] = i;
            }
        }
        return res;
    }
}
