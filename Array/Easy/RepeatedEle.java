package Easy;

public class RepeatedEle {
    public static int repeatedNTimes(int[] nums) {
        int n= nums.length;
        // traverse arr
        for(int i=0; i<n-2; i++){
            // check i+1 or i+2 elements --repeated or not
            if(nums[i] == nums[i+1] || nums[i] == nums[i+2]){
                return nums[i];
            }
        }
    //edge case --last ele = repeated ele
    return nums[n-1];
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,3};
        System.out.println(repeatedNTimes(nums));
    }
}
