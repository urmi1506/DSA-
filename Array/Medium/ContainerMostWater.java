package Medium;

public class ContainerMostWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        // As start with max width
        int left =0;
        int right =n-1;
        int maxWater = 0;
        
        // need both wall
        while(left < right){
                // cal dist bw two line
                int width = right-left;
                // cal minHeight -->Shorter wall limit water
                int minHeight = Math.min(height[left],height[right]);
                // Cal area of curr pair
                int area = width * minHeight;

                // cal maxWater -->finally want container with most water
                maxWater = Math.max(maxWater ,area);

                // remove shorter wall -->as limit the water hold 
                if(height[left] < height[right]){
                    left++;
                }
                else{
                    right--;
                }
        }
    return maxWater;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
