package String;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.locks.Condition;
public class LongSub {

    public static List<String> smallestSubsequences(String s) {
        int n = s.length();
        ArrayList<String> result = new ArrayList<>();
        
        for (int length = 1; length <= n; length++) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                char currentChar = s.charAt(i);
                while (!stack.isEmpty() && stack.peek() > currentChar && (stack.size() + (n - i)) > length) {
                    stack.pop();
                }
                if (stack.size() < length) {
                    stack.push(currentChar);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            result.add(sb.toString());
        }
        
        return result;
    }
}


