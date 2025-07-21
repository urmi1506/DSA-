package BinarySearch;

public class UpperBound {
    public static int upperBound(int[] nums, int x) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>x) {
                return i;
            }
        }
    return n;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,3};
        int x=2;
        System.out.println(upperBound(nums,x));
    }
    
}
