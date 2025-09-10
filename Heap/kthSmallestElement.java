package Heap;
import java.util.Arrays;
public class kthSmallestElement {
    public static int kthSmallest(int[] nums,int k){
        Arrays.sort(nums);
        return nums[k-1];
    }
    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(kthSmallest(nums, k));
    }
}
