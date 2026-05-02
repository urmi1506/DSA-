package Bit_Manipulation;

public class ReverseBit {
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            res += (bit << (31 - i));
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 43261596;
        int reverse_bits= reverseBits(n);
        System.out.println(reverse_bits);
    }
}
