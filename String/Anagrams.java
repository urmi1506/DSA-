package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    static final int MAX_CHAR = 26;

    static String getHash(String s) {
        StringBuilder hash = new StringBuilder();
        int[] freq = new int[MAX_CHAR];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < MAX_CHAR; i++) {
            hash.append(freq[i]);
            hash.append("$");
        }

        return hash.toString();
    }

    static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String key = getHash(arr[i]);

            if (!mp.containsKey(key)) {
                mp.put(key, res.size());
                res.add(new ArrayList<>());
            }

            res.get(mp.get(key)).add(arr[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        String arr[] = {"no", "on", "is"};
        System.out.println(anagrams(arr));
    }
}
