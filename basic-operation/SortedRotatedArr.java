public class SortedRotatedArr {
    public static void main(String[] args) {
       int [] nums = {1,1,1,1};
       System.out.println(check( nums));
    }
    public static boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for (int i = 1; i < n; i++) {
            if(nums[i-1]>nums[i])
            count++;
        }
        if(nums[n-1]>nums[0])
        count++;

        return count<=1;
    }
}
