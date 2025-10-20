package Medium;
import java.util.Arrays;
// TC : O(N log N) SC: O(1)
public class SortZeroOneTwo {
    public static void sortZeroesOnesTwo (int [] nums){
        Arrays.sort(nums);
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortZeroesOnesTwo(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
