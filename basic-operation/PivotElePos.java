import java.util.ArrayList;
import java.util.List;

public class PivotElePos {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(7, 8, 1, 3, 5));
        int k = 3;
        
        int result = search(arr, k);

        if (result != -1) {
            System.out.println("Element " + k + " found at index " + result);
        } else {
            System.out.println("Element " + k + " not present in the array.");
        }
    }

    public static int search(ArrayList<Integer> arr, int k) {
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr.get(mid) == k) {
                return mid; 
            }

            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && k < arr.get(mid)) {
                    high = mid - 1;  
                } else {
                    low = mid + 1;  
                }
            } else {  
                if (arr.get(mid) < k && k <= arr.get(high)) {
                    low = mid + 1; 
                } else {
                    high = mid - 1;  
                }
            }
        }

        return -1; 
    }
}
