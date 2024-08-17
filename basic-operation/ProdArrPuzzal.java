public class ProdArrPuzzal{
    public static long[] productExceptSelf(int nums[]) {
        // code here
         long[] arr = new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=solve(i,nums);
        }
        return arr;
    }
     
    public static long solve(int k,int[] nums)
    {
        long prod=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==k)
             continue;
            
            prod*=(long)nums[i];
             
        }
        return prod;
    }
    public static void main(String[] args) {
        int nums[] = {10, 3, 5, 6, 2};
        
        long[] ans=productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}