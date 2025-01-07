import java.util.HashMap;

public class PairSum2 {
    static int countPairs(int arr[], int target) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count += map.get(complement); 
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return count;
    
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 8;

        System.out.println( countPairs(arr, target));
    }
}
