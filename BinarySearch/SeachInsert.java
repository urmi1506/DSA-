package BinarySearch;

public class SeachInsert {
    public static int searchInsert(int[] nums, int target) {
       int n=nums.length;
       int low=0;
       int high=n-1;
       while(low<=high){
         int mid=low+(high-low)/2;
         if(nums[mid] >target){
            high=mid-1;
         } 
         else if(nums[mid] <target){
            low=mid+1;
         } 
         else if(nums[mid]== target)return mid;
         
       }
    return low;
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums, target));
    }
}
