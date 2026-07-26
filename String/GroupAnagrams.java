package String;

import java.util.*;


public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // map --> sorted version of string + their anagrams string
        Map<String ,List<String>> map = new HashMap<>();

        for(String s : strs){
            // check freq
            int[] freq = new int[26];
            // convert to char
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }
        
            // convert back to string
            String key = Arrays.toString(freq);

            map.putIfAbsent(key ,new ArrayList<>());
            map.get(key).add(s);
        }  
    return new ArrayList<>(map.values());   
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(res);
    }
}
