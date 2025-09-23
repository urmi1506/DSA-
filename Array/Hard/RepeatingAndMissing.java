package Hard;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatingAndMissing {
   static ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>(2);

        // Repeating No : Count freq
        HashMap<Integer,Integer> freq = new HashMap<>();
        int repeating = -1;
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > 1) {
                repeating = num;
            }
        }

        // Missing No
        int n = arr.length;
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (!freq.containsKey(i)) {
                missing = i;
                break;
            }
        }

        list.add(repeating);
        list.add(missing);
        return list;
    }
    public static void main(String[] args) {
        int []arr={4, 3, 6, 2, 1, 1};
        ArrayList<Integer>res=findTwoElement(arr);
        for (Integer ans : res) {
            System.out.println(ans);
        }
    }
    
}
