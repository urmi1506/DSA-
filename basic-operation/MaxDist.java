import java.util.HashMap;

public class MaxDist {
    public static int findMaxDistance(int[] arr) {
        int maxi = Integer.MIN_VALUE; 
        HashMap<Integer, Integer> map = new HashMap<>(); // Map to store the first occurrence index of elements
        int n = arr.length; 

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                // Update maxi with the maximum distance found so far
                maxi = Math.max(maxi, i - map.get(arr[i]));
            } else {
                // Store the first occurrence of the element
                map.put(arr[i], i);
            }
        }

        return maxi == Integer.MIN_VALUE ? -1 : maxi;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3}; 

        int maxDistance = findMaxDistance(arr); 
        System.out.println("Maximum distance between two occurrences of the same element: " + maxDistance);
    }
}
