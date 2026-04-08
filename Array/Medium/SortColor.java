package Medium;

// TC : O(N) SC: O(1)
// Dutch National Flag Algorithm
public class SortColor {
    public static void sortColors(int[] nums) {
        int n=nums.length;
        int whitePtr=0, redPtr=0, bluePtr=n-1;

        while(whitePtr <= bluePtr){
            if(nums[whitePtr]==0){
                int temp = nums[redPtr];
                nums[redPtr]= nums [whitePtr];
                nums[whitePtr]= temp;
                redPtr++;
                whitePtr++;
            }
            else if(nums[whitePtr]==1){
                whitePtr++;
            }
            else{
                int temp = nums[bluePtr];
                nums[bluePtr]= nums [whitePtr];
                nums[whitePtr]= temp;
                bluePtr--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] ={2,0,2,1,1,0};
        sortColors(nums);
        for(int num : nums){
            System.out.print(num +" ");
        }
    }
}
