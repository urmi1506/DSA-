package String;

import java.util.HashMap;

public class MaximumCharacter {
    public static char maxOccuringCharacter(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        
        int max= 0; 
        char res = str.charAt(0);
        for(char ch : str.toCharArray()){
            int cnt = map.getOrDefault(map,0)+1;
            map.put(ch, cnt);

            if(cnt > max){
                max = cnt ;
                res= ch;
            }
        }
    return res;
    }
    public static void main(String[] args) {
        String str = "test";
        char maxChar = maxOccuringCharacter(str);
        System.out.println(maxChar);
    }
}
