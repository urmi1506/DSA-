package BinarySearch;

public class RotateSortedArr {
    public static boolean search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target) return true;

            // to handle duplicate
            else if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
            }
            // check left sorted
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target <= nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }

            }
            // check right sorted
            else if(nums[mid]<=nums[high]){
                if(nums[mid]<=target && target <= nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }

            }

        }
    return false;
    }
    public static void main(String[] args) {
        int nums[]={1,0,1,1,1};
        int target=0;
        System.out.println(search(nums, target));
    }

}
