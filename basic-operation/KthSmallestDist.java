import java.util.Arrays;

public class KthSmallestDist{
    public static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int minDist = 0;
        int maxDist = nums[nums.length - 1] - nums[0];
        
        while (minDist < maxDist) {
            int midDist = (minDist + maxDist) / 2;
            
            if (hasAtLeastKSmallPairs(nums, k, midDist))
                maxDist = midDist;
            else
                minDist = midDist + 1;
        }
        return minDist;
    }
    
    private static boolean hasAtLeastKSmallPairs(int[] nums, int k, int midDist) {
        int validPairCnt = 0; 
        int startPointer = 0;   
        
        for (int endPointer = 1; endPointer < nums.length; endPointer++) {
           
            while (nums[endPointer] - nums[startPointer] > midDist) startPointer++;
            validPairCnt += endPointer - startPointer;
        }
        
        return (validPairCnt >= k);
    }
    public static void main(String[] args) {
        int []nums = {1,3,1};
        int k = 1;
        System.out.println( smallestDistancePair(nums,k));
    }
}