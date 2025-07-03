package BinarySearch;

public class BinarySearchEx {
     public static int search(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]) return mid;
            else if(target > nums[mid]) s=mid+1;
            else if(target < nums[mid]) e=mid-1;

        }
    return -1;
     }
     public static void main(String[] args) {
        int nums[]={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums, target));
     }
}
