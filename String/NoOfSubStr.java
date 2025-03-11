package String;

public class NoOfSubStr {
    public static int numberOfSubstrings(String s) {
        int cnt = 0;
        int left = 0;
        int[] charCnt = new int[3];

        for (int right = 0; right < s.length(); right++) {
            charCnt[s.charAt(right) - 'a']++;

            while (charCnt[0] > 0 && charCnt[1] > 0 && charCnt[2] > 0) {
                cnt += s.length() - right;
                charCnt[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        String s="abcabc";
        System.out.println(numberOfSubstrings(s) );
    }
}
