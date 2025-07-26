package BinarySearch;

public class LastOcc {
    public static int searchRange(int[] nums, int target) {
        int n=nums.length;
        int res =-1;
        for (int i = n-1; i>=0;i--) {
            if (nums[i]==target){
                 res=i;
                 break;
            }
        }
    return res;

    }
    public static void main(String[] args) {
        int nums[]={3,4,13,13,13,20,40};
        int target=13;
        System.out.println(searchRange(nums, target));
    }
}
