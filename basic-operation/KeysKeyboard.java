public class KeysKeyboard {
    public static int minSteps(int n) {
        if (n == 1) return 0;
        
        int steps = 0;
        int fact = 2;
        
        while (n > 1) {
            while (n % fact == 0) {
                steps += fact;
                n /= fact;
            }
            fact++;
        }
        
        return steps;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(minSteps(n));
    }
}
