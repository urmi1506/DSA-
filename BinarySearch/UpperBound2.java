package BinarySearch;

public class UpperBound2 {
     public static int upperBound(int[] nums, int x) {
         int n=nums.length;
         int low=0;
         int high=n-1;
         int ans=n;
         while(low<=high){
            int mid=high+low/2;
            if(mid >x){
                ans= mid;
                high=mid-1;
            }
            low=mid+1;
         }
       return ans;
     }
     public static void main(String[] args) {
        int nums[]={1,2,2,3};
        int x=2;
        System.out.println(upperBound(nums, x));
    }
}
