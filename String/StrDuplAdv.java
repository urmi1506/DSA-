package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class StrDuplAdv {
     static String removeDups(String str) {
        Set<Character> set = new LinkedHashSet<>();
        
        char[] ch = str.toCharArray();
        
        for (char c : ch) {
            set.add(c);
        }
        
        StringBuilder res = new StringBuilder();
        
        for (char c : set) {
            res.append(c);
        }
        
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "zvvo";
        System.out.println(removeDups(str));
    }
}
