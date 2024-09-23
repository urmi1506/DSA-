import java.util.HashMap;
import java.util.Map;
public class RepeatingMiss {

    static int[] findTwoElement(int arr[]) {
        // res[0] store repeating ele
        // res[1] store missing ele
        int[] res = new int[2]; 
        
        // store the freq of each ele
        Map<Integer, Integer> cnt = new HashMap<>();

        // iterate arr & populate freq map
        for (int i : arr) {
            // For each element, increment its freq in map.
            // If ele is not in  map, set freq to 1.
            cnt.put(i, cnt.getOrDefault(i, 0) + 1);
        }

        // check missing & repeating num
        for (int i = 1; i <= arr.length; i++) {
            if (!cnt.containsKey(i)) {
                res[1] = i; 
            } 
            else if (cnt.get(i) == 2) {
                res[0] = i;  
            }
        }
                return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 4, 5};
        int ans[]=findTwoElement(arr);
        for (int res : arr) {
            System.out.println(res);
        }
       
    }

}


