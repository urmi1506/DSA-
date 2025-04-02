public class MaxTriplet {
    public static long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxi = 0;
        for (int i = 0; i < n ; i++) {
            for (int k = n - 1; k > i; k--) {
                int j = i + 1;
                while (j < k) {
                    maxi = Math.max(maxi, (long)(nums[i] - nums[j]) * nums[k]);
                    j++;
                }
            }
        }
        return Math.max(0, maxi);
    }
    public static void main(String[] args) {
        int[] nums = {12,6,1,2,7};
        System.out.println(maximumTripletValue(nums));
    }
}
