package String;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // map --> sorted version of string + their anagrams string
        Map<String ,List<String>> map = new HashMap<>();

        for(String s : strs){
            // convert to charArray
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            // convert back to string
            String sSorted = new String(charArray);

            map.putIfAbsent(sSorted ,new ArrayList<>());
            map.get(sSorted).add(s);
        }  
    return new ArrayList<>(map.values());   
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(res);
    }
}
