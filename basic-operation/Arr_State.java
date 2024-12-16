public class Arr_State {
        public static int[] getFinalState(int[] nums, int k, int multiplier) {
            int[] arr = new int[2];
    
            for (int i = 0; i < k; i++) {
                arr = getMin(nums);
                nums[arr[1]] = arr[0] * multiplier;
            }
    
            return nums;
        }
    
        private static int[] getMin(int[] nums) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
    
            for (int i = 0; i < nums.length; i++)
                if (nums[i] < min) {
                    min = nums[i];
                    idx = i;
                }
    
            return new int[] { min, idx };
        }
    
    public static void main(String[] args) {
        int nums[]={2,1,3,5,6};
        int k = 5, multiplier = 2 ;
        System.out.println(getFinalState(nums,  k, multiplier));
    }
}
