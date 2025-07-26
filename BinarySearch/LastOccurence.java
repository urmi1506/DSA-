package BinarySearch;

public class LastOccurence {
    public static int lastOccurence(int[]nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low);
            if(nums[mid]<target){
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
               res=mid;
               low=mid+1;

            }
        }
    return res;
    }
    public static void main(String[] args) {
        int nums[]={3,4,13,13,13,20,40};
        int target=13;
        System.out.println(lastOccurence(nums, target));
    }
}
