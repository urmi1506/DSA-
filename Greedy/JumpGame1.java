package Greedy;

public class JumpGame1 {
    public static boolean canJump(int[] nums) {
        // initialized maxIdx ---check max jump take for currIdx
        int maxIdx =0;
        int n = nums.length;

        for(int i =0; i<n; i++){
            if(i > maxIdx) return false;
            maxIdx = Math.max(maxIdx , i+nums[i]);
        }

    return true;
    }
    public static void main(String[] args) {
        int[]nums = {2,3,1,1,4};
        boolean res = canJump(nums);
        System.out.println(res);
    }
}
