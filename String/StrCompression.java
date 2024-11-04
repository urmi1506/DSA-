package String;

public class StrCompression {
    public static String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int cnt = 1, n = word.length();
        char ch = word.charAt(0);
        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == ch && cnt < 9) {
                cnt++;
            } else {
                comp.append(cnt).append(ch);
                ch = word.charAt(i);
                cnt = 1;
            }
        }
        comp.append(cnt).append(ch);
        return comp.toString();
    }
    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(compressedString(word));
    }
}
