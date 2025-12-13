package Medium;

public class SubArrSumK {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt =0;
        //Traverse arr
        for (int i = 0; i < n; i++) {
            int sum =0;
            //Expand subarr
            for (int j = i; j < n; j++) {
                //compute sum
                sum += nums[j];
                //track cnt
                if(sum == k ) cnt ++;
            }
        }
    return cnt;
    }
    public static void main(String[] args) {    
        int[] nums ={1,1,1};
        int k =2;
        System.out.println(subarraySum(nums, k));
    }
}
