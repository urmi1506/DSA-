package Hashing;

public class MinMirrorDist {
    public static int minMirrorPairDistance(int[] nums) {
        int min_dist = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(reverse(nums[i]) == nums[j]){
                    int curr_dist = Math.abs(i - j);
                     if(curr_dist < min_dist) {
                         min_dist = curr_dist;
                     }
                }
                
            }
        }
        return min_dist == Integer.MAX_VALUE ? -1 : min_dist;
    }
    private static int reverse(int num){
        int rev =0;
        while(num != 0){
            int digit = num % 10;
            rev = (rev *10) + digit;
            num /= 10;
        }
    return rev;
    }
    public static void main(String[] args) {
        int[] nums = {120 ,21};
        // [21 , 120] ,(duplicate + mirror no) [11 , 11 ,11] ,(duplicate + No mirror no)[12 ,12 ,12] --edge cases
        int minDist = minMirrorPairDistance(nums);
        System.out.println(minDist);
        
    }

}
