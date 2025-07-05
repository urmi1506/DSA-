package Easy;
import java.util.HashMap;

public class LuckyInt {
    
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int luckyInteger = -1;

        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                luckyInteger = key; 
            }
        }
        return luckyInteger;  
    }
    public static void main(String[] args) {
        int[] arr={2,2,3,4};
        System.out.println(findLucky(arr));
    }
}
