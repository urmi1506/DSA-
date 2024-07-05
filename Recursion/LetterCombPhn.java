package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombPhn {
    public static void main(String[] args) {
       String  digits = "23";
       System.out.println(letterCombinations( digits) );
    }
    private static void solve(String digits, int index, StringBuilder output, List<String> ans, String[] mapping) {
        // Base case: 
        if (index == digits.length()) {
            ans.add(output.toString());
            return;
        }

        //  digit and its mapping
        int num = digits.charAt(index) - '0';
        String value = mapping[num];

        // Iterate over  letters that current digit represent
        for (int i = 0; i < value.length(); i++) {
            output.append(value.charAt(i));
            solve(digits, index + 1, output, ans, mapping);

            // remove current letter ... backtrack
            output.deleteCharAt(output.length() - 1);
        }
    }

    public static List<String> letterCombinations(String digits) {
        // List to store the overall answer
        List<String> ans = new ArrayList<>();
        //store only current output
        StringBuilder output= new StringBuilder("");
        int index=0; 

        if (digits.length() == 0) {
            return ans;
        }
        // mapping of digits 
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        solve(digits, index, output, ans, mapping);

        return ans;
    }
}
