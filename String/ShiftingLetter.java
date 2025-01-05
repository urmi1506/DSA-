package String;

public class ShiftingLetter {
        public static String shiftingLetters(String s, int[][] shifts) {
            int n = s.length();
            int[] shift = new int[n + 1];
    
            for (int[] shiftOp : shifts) {
                int start = shiftOp[0], end = shiftOp[1], direction = shiftOp[2];
                shift[start] += (direction == 1 ? 1 : -1);
                if (end + 1 < n) shift[end + 1] -= (direction == 1 ? 1 : -1);
            }
    
            int currentShift = 0;
            for (int i = 0; i < n; ++i) {
                currentShift += shift[i];
                shift[i] = currentShift;
            }
    
            StringBuilder result = new StringBuilder(s);
            for (int i = 0; i < n; ++i) {
                int netShift = (shift[i] % 26 + 26) % 26;
                result.setCharAt(i, (char) ('a' + (s.charAt(i) - 'a' + netShift) % 26));
            }
    
            return result.toString();
        }
    public static void main(String[] args) {
        String s = "dztz";
        int[][] shifts = {{0,0,0},{1,1,1}};
        System.out.println(shiftingLetters(s,shifts));
    }
}
