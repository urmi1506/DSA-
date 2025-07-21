package BinarySearch;

public class LowerBound {
    public static int lowerBound(int[] nums, int x) {
       int ans=0;
       int n=nums.length;
       for(int i=0; i<n; i++){
        if(nums[i]>=x) {
            ans=i;
            break;
        }
       }
    return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,3};
        int x=2;
        System.out.println(lowerBound(nums, x));
    }

}
