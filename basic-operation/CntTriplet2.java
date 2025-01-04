 import java.util.HashMap;

public class CntTriplet2 {
    public static int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int cnt = 0;

        for (int i = 0; i < n - 2; i++) {
            int remainingSum = target - arr[i]; 
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < n; j++) {
                int neededValue = remainingSum - arr[j]; 

                if (map.containsKey(neededValue)) {
                    cnt += map.get(neededValue); 
                }

                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = {-3, -1, -1, 0, 1, 2};
        int target = -2;
        System.out.println(countTriplets(arr,target));
    }
}

