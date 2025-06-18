package Easy;

public class MissingNo2 {
    public static int missingNumber(int[] nums) {
         int n = nums.length ;
        int xor1 = 0, xor2 = 0;

        // XOR all array elements
        for (int i = 0; i < n ; i++) {
            xor2 ^= nums[i];
        }

        // XOR all numbers from 1 to n
        for (int i = 0; i <= n; i++) {
            xor1 ^= i;
        }

        // Missing number is the XOR of xor1 and xor2
        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        int nums[] ={3,0,1};
        System.out.println(missingNumber(nums));
    }
}
