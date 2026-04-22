package String;

import java.util.*;

public class TwoEditWord {
    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        // List to store ans which matches
        List<String> res = new ArrayList<>();
        // Assume all str have same len
        int StringLen = queries[0].length();

        for(String queryStr : queries){
            for(String dictWord : dictionary){
                int diff_cnt =0;
                for(int i=0; i<StringLen; ++i){
                    // compare word
                    if(queryStr.charAt(i) != dictWord.charAt(i)){
                        diff_cnt++;
                    }
                }
                // diff_cnt <3 ..add match query word to final res
                if(diff_cnt < 3){
                    res.add(queryStr);
                    break;
                }
                
            }
        }
    return res;
    }
    public static void main(String[] args) {
        String[] queries= {"word","note","ants","wood" };
        String[] dictionary = { "wood","joke","moat"};

        List<String> TwoEditWords = twoEditWords(queries, dictionary);
        for (String string : TwoEditWords) {
            System.out.println(string);
        }
    }
}
