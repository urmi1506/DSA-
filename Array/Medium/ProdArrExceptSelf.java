package Medium;

public class ProdArrExceptSelf {
     public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int prod = 1;
            for(int j=0; j<n; j++){
               if(i == j)
                  continue;

               prod *= nums[j];
            }
        ans[i] = prod;
        }
    return ans;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int[] result = productExceptSelf(nums);
        
        for (int i : result) {
            System.out.println(i);
        }

    }
}
