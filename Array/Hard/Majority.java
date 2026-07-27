package Hard;
import java.util.Arrays;
public class Majority {
    public static int majorityElelment(int []nums){
        int n=nums.length;
         // work only majority element is present 
        // Fail cond ---> 1,2,3  or 1,1,2,2 (no majority)
        Arrays.sort(nums);
        return nums[n/2];
    }
    public static void main(String[] args) {
        int nums[]={3,2,3};
        System.out.println(majorityElelment(nums));
    }
}
