package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CntVowel {
     public static int[] vowelStrings(String[] words, int[][] queries) {
        int m = words.length;
        int n=queries.length;
        int[] Prefix = new int[m + 1];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < m; i++) {
            Prefix[i + 1] = Prefix[i];
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                Prefix[i + 1]++;
            }
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = Prefix[queries[i][1] + 1] - Prefix[queries[i][0]];
        }
        return res;
    }
    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2},{1,4},{1,1}};
        int[]ans =vowelStrings(words,queries);
        for (int res : ans) {
            System.out.println(res);
        }
    }
}
