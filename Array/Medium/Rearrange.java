package Medium;

public class Rearrange {
    public static int[] rearrangeArray(int[] nums) {
        int n =nums.length;

        // initialize array to store ans
        int res[] =new int[n];
        // positive index for positive no
        int posIdx = 0;
        // negative index for negative no
        int negIdx = 1;

        for (int i = 0; i < n; i++) {
            // Rearrange data 
            if(nums[i] > 0){
                res[posIdx] = nums[i];
                // because we want +ve and -ve altenate
                posIdx +=2;
            }
            else{
                res[negIdx] = nums[i];
                negIdx +=2;
            }
        }

    return res;
    }
    public static void main(String[] args) {
        int nums[] ={ 3,1,-2,-5,2,-4};
        int []ans =rearrangeArray(nums);
        for (int res : ans) {
            System.out.println(res);
        }

    }
}
