package Hard;

public class TrappingRainWater {
     public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int totalWater = 0;

        while (left < right) {

            if (height[left] < height[right]) {
                // Process left side
                leftMax = Math.max(leftMax, height[left]);
                totalWater += leftMax - height[left];
                left++;

            } else {
                // Process right side
                rightMax = Math.max(rightMax, height[right]);
                totalWater += rightMax - height[right];
                right--;
            }
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total water trapped: " + trap(height));
    }
}
