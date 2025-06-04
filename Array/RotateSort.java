package Array;

public class RotateSort {
    public static boolean rotateSortArr(int nums[]){
        int n=nums.length;
        int cnt=0;
        // check inversion
        // bigger number before a smaller one — inversion.A rotated sorted array can have at most one inversion
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i-1]) cnt++;
        }
        // check rotation condition .In a sorted array, the last number is less than or equal to the first number if rotated correctly.


        if(nums[n-1] > nums[0]) cnt++;

       // return cnt <= 1;

        if(cnt <=1 ) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums ={3,4,5,1,2};
        System.out.println(rotateSortArr(nums));
    }
}
