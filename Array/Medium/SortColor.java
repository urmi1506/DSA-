package Medium;

// TC : O(N) SC: O(1)
// Dutch National Flag Algorithm
public class SortColor {
    public static void sortColors(int[] nums) {
        int n=nums.length;
        int whitePointer=0, redPointer=0, bluePointer=n-1;

        while(whitePointer <= redPointer){
            if(nums[whitePointer]==0){
                int temp = nums[redPointer];
                nums[redPointer]= nums [whitePointer];
                nums[whitePointer]= temp;
                redPointer++;
                whitePointer++;
            }
            else if(nums[whitePointer]==1){
                whitePointer++;
            }
            else{
                int temp = nums[bluePointer];
                nums[bluePointer]= nums [whitePointer];
                nums[whitePointer]= temp;
                bluePointer--;
            }
        }
    }
}
