import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumClosest {
     public static List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        
        if (arr.length < 2) {
            return result;
        }
        
        Arrays.sort(arr);
        
        int closestDiff = Integer.MAX_VALUE; 
        int maxAbsDiff = Integer.MIN_VALUE;  
        int left = 0, right = arr.length - 1;
        
        while (left < right) { 
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            
            if (diff < closestDiff || (diff == closestDiff && (arr[right] - arr[left]) > maxAbsDiff)) {
                closestDiff = diff;
                maxAbsDiff = arr[right] - arr[left];
                result = Arrays.asList(arr[left], arr[right]);
            }
            
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 5};
        int target = 25;
        System.out.println(sumClosest(arr, target) );
    }
}
