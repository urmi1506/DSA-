import java.util.HashSet;
import java.util.Iterator;

public class TwoSum2 {
     static boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int val = it.next();
            int remaining = target - val;
            
            if (set.contains(remaining) && remaining != val) return true;
        }
        
        return false;
    }
   public static void main(String[] args) {
    int arr[] = {1, 4, 45, 6, 10, 8};
    int target = 16;
    System.out.println(twoSum(arr, target));
   }
}
