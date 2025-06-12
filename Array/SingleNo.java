package Array;

public class SingleNo {
    public static int singleNumber(int[] nums){
        int x =0;

        for (int i : nums) {
            x = x ^ i;
        }
    return x;
    }
    public static void main(String[] args) {
        int []nums ={2,2,1};
        System.out.println(singleNumber(nums));
    }
}
