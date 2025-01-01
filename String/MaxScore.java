package String;

public class MaxScore {
    public static int maxScore(String s) {
       
        int n=s.length();
        int totalOnes = 0;
        int zeroesCnt = 0;
        int onesCnt = 0;
        int maxScore = Integer.MIN_VALUE;

        for (char ch : s.toCharArray()) {
            if (ch == '1') totalOnes++;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') zeroesCnt++;
            else onesCnt++;

            int currScore = zeroesCnt + (totalOnes - onesCnt);
            maxScore = Math.max(maxScore, currScore);

        }

        return maxScore;
    }
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore( s));
    }
}
