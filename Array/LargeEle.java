package Array;
public class LargeEle {
    public static int largestElement(int[] nums) {
        int n = nums.length;
        int max_ele = nums[0];
        for(int i =1 ; i < n-1; i++){
            if (nums[i] > nums [max_ele]){
                max_ele= nums[i];
            }
        }
        return max_ele;
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};
        System.out.println(largestElement(nums));
        }
}
