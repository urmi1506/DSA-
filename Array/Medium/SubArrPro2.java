package Medium;

public class SubArrPro2 {
    public static int maxProduct(int[] nums) {
        int maxRes = Integer.MIN_VALUE;

        // Handle negative
        for (int num : nums) {
            maxRes = Math.max(maxRes, num);
        }

        // take min also - - give lage +ve
        int currMax = 1;
        int currMin = 1;

        for (int num : nums) {
            int temp = currMax * num;

            currMax = Math.max(temp, Math.max(currMin * num, num));
            currMin = Math.min(temp, Math.min(currMin * num, num));

            maxRes = Math.max(maxRes, currMax);
        }

        return maxRes;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4 };
        System.out.println(maxProduct(nums));

    }
}


