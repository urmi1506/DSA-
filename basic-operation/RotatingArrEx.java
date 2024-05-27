public class RotatingArrEx {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7};
       int k = 3;
      rotate( nums,  k);
      for (int num : nums) {
        System.out.println(num);
      }
    }

    public static void rotate(int [] nums, int k) {
        int []temp=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[(i+k)%nums.length]=nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);

    }
}
// we can't store data in num instead of it we take temp otherwise data will override