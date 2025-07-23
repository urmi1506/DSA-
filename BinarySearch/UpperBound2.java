package BinarySearch;

public class UpperBound2 {
     public static int upperBound(int[] nums, int x) {
         int n=nums.length;
         int low=0;
         int high=n-1;
         int ans=n;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] >x){
                ans= mid;
                high=mid-1;
            }
            else{
            low=mid+1;
            }
         }
       return ans;
     }
     public static void main(String[] args) {
        int nums[]={3,5,8,15,19};
        int x=2;
        System.out.println(upperBound(nums, x));
    }
}
