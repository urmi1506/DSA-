package String;

public class PrefCnt {
    public static int prefixCount(String[] words, String pref) {
        int cnt=0;
        for(String word : words){
            if( word.startsWith(pref) ) cnt++;
        }
    return cnt;
    }
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words,pref) );
    }
}
