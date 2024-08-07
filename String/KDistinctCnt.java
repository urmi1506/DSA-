package String;
import java.util.HashMap;
import java.util.Map;

public class KDistinctCnt {

    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> countMap = new HashMap<>();

        // Count occurrences of each string
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        // Identify distinct strings in order and find the kth distinct
        int distinctCount = 0;
        for (String s : arr) {
            if (countMap.get(s) == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return s;
                }
            }
        }

        // If there are fewer than k distinct strings, return an empty string
        return "";
    }
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "b", "d", "e"};
        int k = 2;
        System.out.println(kthDistinct(arr,k));

    }
}

