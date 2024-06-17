package Recursion;

public class RecuCount {
    public static void main(String[] args) {
        int n = 5;
        long ans = sequence(n);
        System.out.println(ans);
    }

    static long sequence(int n) {
        long mod = (long) Math.pow(10, 9) + 7;
        long ans=0;
        // Base case
        if (n > 1000)
            return ans % mod;

        ans = sequence(n - 1) * n;
        return ans;
    }
}
