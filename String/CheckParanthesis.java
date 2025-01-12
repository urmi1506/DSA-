package String;

public class CheckParanthesis {
    public static boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false;
        int balance = 0;
        int available = 0;
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                available++;
            } else {
                if (s.charAt(i) == '(') balance++;
                else balance--;
            }
            if (balance + available < 0) return false;
        }
        balance = 0;
        available = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                available++;
            } else {
                if (s.charAt(i) == ')') balance++;
                else balance--;
            }
            if (balance + available < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "()()", locked = "0000";
        System.out.println(canBeValid(s, locked));
    }
}
