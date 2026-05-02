package Bit_Manipulation;

public class No1Bits {
    public static int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 11 ;
        int ans = hammingWeight(n);
        System.out.println(ans);
    }
}
