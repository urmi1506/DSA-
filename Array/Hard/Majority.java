package Hard;
import java.util.Arrays;
public class Majority {
    public static int majorityElelment(int []nums){
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
    public static void main(String[] args) {
        int nums[]={3,2,3};
        System.out.println(majorityElelment(nums));
    }
}
