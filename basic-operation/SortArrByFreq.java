import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class SortArrByFreq {
    public static ArrayList<Integer> sortByFreq(int arr[]) {
        // store frequency of each element
        HashMap<Integer, Integer> set = new HashMap<>();

        // Populate the frequency map
        for (int i : arr) {
            set.put(i, set.getOrDefault(i, 0) + 1);
        }

        // hold elements of the array
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Sort the list based on frequency and then by natural order
        Collections.sort(list, (a, b) -> {
            int freqA = set.get(a); // Frequency of element a
            int freqB = set.get(b); // Frequency of element b
            if (freqA != freqB) {
                return freqB - freqA; // Sort by descending frequency
            } else {
                return a - b; // Sort by ascending value if frequencies are equal
            }
        });

        return list; 
    }
    public static void main(String[] args) {
        int arr[] = {5, 5, 4, 6, 4};
        ArrayList<Integer> ans=sortByFreq(arr);
        for (Integer res : ans) {
            System.out.println(res);
        }

    }
}


