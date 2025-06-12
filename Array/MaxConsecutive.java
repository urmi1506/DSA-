package Array;

public class MaxConsecutive {
    public static int maxConsecutives(int[] nums ){
        int n = nums.length;

        // track the count of 1
        int cnt = 0;
        // track max cnt we want to return max cnt
        int maxi = 0;

        for(int i=0 ; i<n ; i++){
        // cond for 1's consecutives
            if(nums[i] == 1){
                cnt++;
            }
            else{
                cnt =0;
            }
        // find max
            maxi = Math.max(maxi, cnt);
        }
    return maxi;
    }
}
