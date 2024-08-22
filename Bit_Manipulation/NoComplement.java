package Bit_Manipulation;

public class NoComplement {
    public static int findComplement(int num) {
        if (num == 0) return 1;

        int bitLen = Integer.toBinaryString(num).length();
        
        int mask = (1 << bitLen) - 1;
        
        return num ^ mask;
    }
    public static void main(String[] args) {
        int num =5;
        System.out.println(findComplement(num));
    }
}
