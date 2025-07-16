package BinarySearch;

public class FirstLastOcc {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        res[0] = left;
        res[1] = right;
        return res;   
    }
    private static int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int n=nums.length;
        int left = 0;
        int right=n-1;
        int idx=-1;

        while (left <= right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target) left=mid+1;
            else if(nums[mid]>target) right=mid-1;
            else{
                idx=mid;
                if(isSearchingLeft) right=mid-1;
                else{
                    left=mid+1;
                }

            }
        }
    return idx;
    }
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int[]ans=searchRange(nums, target);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
