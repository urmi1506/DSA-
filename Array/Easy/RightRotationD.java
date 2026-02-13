package Easy;

public class RightRotationD {
    public static void reverse(int nums[], int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }

    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        // single /empty array
        if(n<=1) return;

        //k>n
        k=k%n;
        
        // reverse whole arr
        reverse(nums, 0, n - 1);
        // reverse first k part
        reverse(nums, 0, k - 1);
        // reverse remaining k-1 part
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
