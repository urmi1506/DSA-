
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // Add all opening brackets in the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                s.push(currentChar);
            } else {
                // stack empty..false
                if (s.isEmpty()) {
                    return false;
                } else {
                    // pop element from stack with their closing brackect
                    char top = s.pop();
                    // compare pop brackect wid curr closing brackect..if not match return false
                    if ((currentChar == ')' && top != '(') ||
                        (currentChar == '}' && top != '{') ||
                        (currentChar == ']' && top != '[')) {
                        return false;
                    }
                }
            }
        }
        
        // return s.isEmpty();
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(isValid(test1)); // true
        System.out.println(isValid(test2)); // true
        System.out.println(isValid(test3)); // false
        System.out.println(isValid(test4)); // false
        System.out.println(isValid(test5)); // true
    }
}
