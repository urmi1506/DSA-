package BinarySearch;

public class FindMinimum {
    public static int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low < high){
            int mid=low+(high-low)/2;

            if(nums[mid] < nums[high]){
                high=mid;
            }
            else{
                low=mid+1;
            }

        }
    return nums[low];
        
    }
    public static void main(String[] args) {
        int nums[]={3,4,5,1,2};
        System.out.println(findMin(nums));
    }

}
