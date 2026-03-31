package String;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        if (strs.length == 0 || strs == null) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return res.toString();
                }
            }
            res.append(strs[0].charAt(i));
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
