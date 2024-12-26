public class TargetSum{
    public static int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }

    private static int helper(int[] arr, int target, int ind, int sum) {
        int n=arr.length;
        if (ind >= n) return sum == target ? 1 : 0;
        
        int subtract = helper(arr, target, ind + 1, sum - arr[ind]);
        int add = helper(arr, target, ind + 1, sum + arr[ind]);

        return subtract + add;
    }
    public static void main(String[] args) {
        int []nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }
}