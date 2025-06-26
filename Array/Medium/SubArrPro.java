package Medium;

public class SubArrPro {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxprod = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                if (prod > maxprod) {
                    maxprod = prod;
                }
            }
        }

        return maxprod;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4 };
        System.out.println(maxProduct(nums));

    }
}
