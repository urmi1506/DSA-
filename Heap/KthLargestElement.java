package Heap;
import java.util.Arrays;
public class KthLargestElement {
    public static int KthLargestEle(int[] nums ,int k){
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
    public static void main(String[] args) {
        int nums[]={3,2,3,1,2,4,5,5,6};
        int k=3;
        System.out.println(KthLargestEle(nums, k));
    }
}
