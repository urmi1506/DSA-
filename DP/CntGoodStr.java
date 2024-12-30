package DP;

public class CntGoodStr {
    private static int mod = (int) 1e9 + 7;

    public static int countGoodStrings(int low, int high, int zero, int one) {
        if (zero > one) 
        return countGoodStrings(low, high, one, zero);

        int dp[] = new int[high + 1], res = 0;
        dp[0] = 1;

        for (int i = 1; i <= high; i++) {
            if (i >= zero)
                dp[i] = (dp[i] + dp[i - zero]) % mod;
            if (i >= one)
                dp[i] = (dp[i] + dp[i - one]) % mod;
            if (i >= low)
                res = (res + dp[i]) % mod;
        }

        return res;
    }
    public static void main(String[] args) {
       int low = 3, high = 3, zero = 1, one = 1 ;
       System.out.println(countGoodStrings(low, high, zero, one) );
    }
}
