public class PalindromeNo1 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {111, 222, 333, 444, 555};

        System.out.println(palinArray(a, n));
    }

    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int num = a[i];
            int rev = 0;

            while (num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num /= 10;
            }

            if (a[i] != rev) {
                return 0; 
            }
        }

        return 1; 
    }
}
