package String;

import java.util.ArrayList;
import java.util.List;

public class StrMatchingArr {
    public static List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i != j && words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
        }

        return list;
    }
   public static void main(String[] args) {
    String words[] = {"mass","as","hero","superhero"};
    System.out.println(stringMatching(words));
   }
}
