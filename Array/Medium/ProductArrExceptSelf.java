package Medium;

public class ProductArrExceptSelf {
    public static int[] productExceptSelf(int[] nums) { 

        int n = nums.length;

        // store final an
        int[] ans = new int[n]; 
        // no element at leftmost so prod= 1
        ans[0] = 1; 

        // Build LEFT product
        for(int i = 1; i < n; i++){ 
            // Everything before i = previous left produ *nums[i-1]
            ans[i] = ans[i - 1] * nums[i - 1]; 
        } 
        // no element at rightmost so prod= 1
        int suffix = 1; 

        // Move from RIGHT to LEFT
        for(int i = n - 1; i >= 0; i--){ 
            // ans[i] already has LEFT product.
            // Multiply it by RIGHT product.
            ans[i] *= suffix; 

            // Add current number to the right product
            // for the next index
            suffix *= nums[i]; 
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
