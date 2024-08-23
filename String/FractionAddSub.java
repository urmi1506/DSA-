package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FractionAddSub {
    public static String fractionAddition(String expression) {
        int currNumerator = 0, currDenominator = 1;

        Pattern fractionPattern = Pattern.compile("([+-]?\\d+)/(\\d+)");
        Matcher matcher = fractionPattern.matcher(expression);

        while (matcher.find()) {
            int newNumerator = Integer.parseInt(matcher.group(1));
            int newDenominator = Integer.parseInt(matcher.group(2));

            currNumerator = currNumerator * newDenominator + newNumerator * currDenominator;
            currDenominator *= newDenominator;

            int greatestCommonDivisor = gcd(Math.abs(currNumerator), currDenominator);
            currNumerator /= greatestCommonDivisor;
            currDenominator /= greatestCommonDivisor;

            if (currDenominator < 0) {
                currNumerator = -currNumerator;
                currDenominator = -currDenominator;
            }
        }

        return currNumerator + "/" + currDenominator;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        String expression = "-1/2+1/2" ;
        System.out.println(fractionAddition(expression));
    }
}
