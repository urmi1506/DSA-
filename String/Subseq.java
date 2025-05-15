package String;
import java.util.ArrayList;
import java.util.List;

public class Subseq {
    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int last = -1;
        for (int i = 0; i < words.length; i++) {
            if (groups[i] != last) {
                result.add(words[i]);
                last = groups[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words = {"e","a","b"};
        int[] groups = {0,0,1};
        List<String> res = getLongestSubsequence(words, groups);
        for (String ans : res) {
            System.out.println(ans);
        }

    }
}
