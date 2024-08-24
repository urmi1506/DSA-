package String;

public class ClosestPalindrome {
    public static String nearestPalindromic(String n) {
    
        long num = Long.parseLong(n);
        if (num <= 10) return String.valueOf(num - 1);
        if (num == 11) return "9";

        int len = n.length();
        long leftPart = Long.parseLong(n.substring(0, (len + 1) / 2));
        
        long[] candidates = new long[5];
        candidates[0] = createPalindrome(leftPart - 1, len % 2 == 0);
        candidates[1] = createPalindrome(leftPart, len % 2 == 0);
        candidates[2] = createPalindrome(leftPart + 1, len % 2 == 0);
        candidates[3] = (long) Math.pow(10, len - 1) - 1;
        candidates[4] = (long) Math.pow(10, len) + 1;

        long closestPalindrome = 0;
        long minDiff = Long.MAX_VALUE;

        for (long candidate : candidates) {
            if (candidate == num) continue;
            long diff = Math.abs(candidate - num);
            if (diff < minDiff || (diff == minDiff && candidate < closestPalindrome)) {
                minDiff = diff;
                closestPalindrome = candidate;
            }
        }

        return String.valueOf(closestPalindrome);
    }

    private static long createPalindrome(long leftPart, boolean isEven) {
        long palindrome = leftPart;
        if (!isEven) leftPart /= 10;
        while (leftPart > 0) {
            palindrome = palindrome * 10 + leftPart % 10;
            leftPart /= 10;
        }
        return palindrome;
    }
    public static void main(String[] args) {
        String n="123";
        System.out.println(nearestPalindromic(n));
    }
}
