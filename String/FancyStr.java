package String;

public class FancyStr {
    public static String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = res.length();
            if (n < 2 || !(res.charAt(n - 1) == c && res.charAt(n - 2) == c)) {
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }
}
