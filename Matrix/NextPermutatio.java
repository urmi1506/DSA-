package Matrix;

public class NextPermutatio {
public static void nextPermutation(int[] nums) {
        int n=nums.length;
        // find break point
        int idx = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                idx= i;
                break;
            }
        }
        // No break point found
        if(idx == -1){
            reverse(nums, 0, n - 1);
            return;
        }
        // if break point exist
        // 1.find next greater element and swap  with idx
        for(int i=n-1; i>idx; i--){
            if(nums[i]>nums[idx]){
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
                break;
            }
        }
        // 2.reverse right half
        reverse(nums, idx + 1, n - 1);
    }
    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        nextPermutation(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
