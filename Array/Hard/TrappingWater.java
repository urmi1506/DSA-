package Hard;

public class TrappingWater {
     public static int trap(int[] height) {
        int n = height.length;

        int totalWater = 0;

        // Traverse the arr
        for(int i=0; i<n; i++){
            int leftmax = 0;
            int rightmax = 0;

            // Final tallest wall from left
            for(int j=0; j<=i; j++){
                leftmax=Math.max(leftmax ,height[j]);
            }

            // Final tallest wall from right
            for(int j=i; j<n; j++){
                rightmax=Math.max(rightmax ,height[j]);
            }

            // Smaller wall decide water trap in currlevel
            int currlevel = Math.min(leftmax,rightmax);

            // Find water trap
            int water = currlevel - height[i];

            // Need totalWater
            totalWater += water;
        }
    return totalWater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total water trapped: " + trap(height));
    }
}