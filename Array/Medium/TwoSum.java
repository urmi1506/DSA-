package Medium;

public class TwoSum{
    public static int[] twoSum(int[]nums,int target){
        // Array to store Ans
        int ans[] =  new int[2];

        // initially both indx -1
        ans[0]= ans[1]=-1;

       // Find Two Sum Of Array    
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i == j) continue;
                if(nums[i] + nums[j] == target) {
                    ans[0] =i;
                    ans[1] =j;
                return ans;
                }
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9 ;
        int[]res =twoSum(nums, target);
        for (int i : res) {
            System.out.println(i);
        }
    }
}