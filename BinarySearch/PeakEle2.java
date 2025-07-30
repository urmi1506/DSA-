package BinarySearch;

public class PeakEle2 {
    public static int findPeakElement(int[] nums) {
        int n=nums.length;
        for(int i=0;  i<n; i++){
           if((i==0 || nums[i]>nums[i-1]) && (i==n-1 || nums[i]>nums[i+1])){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
}
