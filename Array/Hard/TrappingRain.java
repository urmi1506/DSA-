package Hard;

public class TrappingRain {
     public static int trap(int[] height) {
        int n = height.length;

        int totalWater = 0;
            // store left tallest wall & right wall
            int leftmax[] = new int[n];
            int rightmax[] = new int[n];
        
            // Final tallest wall from left
            leftmax[0] =height[0];
            for(int i=1; i<n; i++){
                leftmax[i]=Math.max(leftmax[i-1] ,height[i]);
            }

            // Final tallest wall from right
            rightmax[n-1]=height[n-1];
            for(int i=n-2; i>=0; i--){
                rightmax[i]=Math.max(rightmax[i+1] ,height[i]);
            }
        for(int i=0; i<n; i++){
            // Smaller wall decide water trap in currlevel
            int currlevel = Math.min(leftmax[i],rightmax[i]);

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
