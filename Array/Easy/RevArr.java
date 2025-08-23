package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RevArr {
    public static void reverse(List<Integer>nums){
        Collections.reverse(nums);
    }
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(nums);
        for (Integer i : nums) {
            System.out.println(i);
        }
    }
}
