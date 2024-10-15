package Greedy;

public class MinStep {
    public static long minimumSteps(String s) {
        long swap = 0;
        int black = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') 
                swap += (long) black; 
            else
                black++; 
        }
        return swap;
    }
    public static void main(String[] args) {
        String s = "101";
        System.out.println(minimumSteps( s));
    }
}
