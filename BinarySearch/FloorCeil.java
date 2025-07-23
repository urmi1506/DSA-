package BinarySearch;

public class FloorCeil {
    public static int[] getFloorAndCeil(int[] nums, int x) {
       int n=nums.length;
       int f = findFloor(nums, n, x);
        int c = findCeil(nums, n, x);
        return new int[] {f, c};

    }
    static int findFloor(int[] nums, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return ans;
    }

    static int findCeil(int[] nums, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        int[] ans = getFloorAndCeil(nums, n);
        System.out.println(ans[0]
                           + " " + ans[1]);
    }
    
}
