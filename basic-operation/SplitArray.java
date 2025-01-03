public class SplitArray {
        public static int waysToSplitArray(int[] nums) {
            long left = 0, right = 0;
            for (int val : nums) {
                right += val;
            }
    
            int Splits = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                left += nums[i];
                right -= nums[i];
                if (left >= right) {
                    Splits++;
                }
            }
    
            return Splits;
        }
        public static void main(String[] args) {
           int[] nums = {10,4,-8,7};
           System.out.println(waysToSplitArray(nums));
        }
}
