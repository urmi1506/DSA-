package Medium;

public class ContainerWater {
    public static int maxArea(int[] height) {
        int n = height.length;

        int maxWater = 0;

        // Traverse through each & every pair --> need both wall
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                // cal dist bw two line
                int width = j-i;
                // cal minHeight -->Shorter wall limit water
                int minHeight = Math.min(height[i],height[j]);
                // Cal area of curr pair
                int area = width * minHeight;

                // cal maxWater -->finally want container with most water
                maxWater = Math.max(maxWater ,area);
            }
        }
    return maxWater;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
