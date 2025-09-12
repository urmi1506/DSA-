package Medium;
public class KadaneAlgo {
    public static int maxSum(int[]nums){
        int n=nums.length;
        int sum =0;
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
            if (sum > maxi) maxi=sum;
            if (sum <0) sum=0;
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }
}
