package String;

public class Anagrams2 {
    public static boolean isAnagrams(String s , String t){
        // Base case --check length
        if(s.length() != t.length())return false;

        // store alphabet 0-25 range
        int[] arr = new int[26];

        // traverse string
        for(int i=0; i<s.length(); i++){
            // convert ascii to 0-25 range
            arr[s.charAt(i) - 'a'] ++;
            arr[t.charAt(i) - 'a']--;

        }
        //check anagrams
        for (int check: arr) {
            if(check != 0) return false;
        }
    return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram" ;

        boolean ans = isAnagrams(s, t);
        System.out.println(ans);
    }
}
