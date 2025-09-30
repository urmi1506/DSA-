import java.util.Stack;

public class ReverseStrByStack {
    public static void main(String[] args) {
        
        Stack<Character> s = new Stack<>();
        String str = "urmi";

        // Insert input into the stack
        for (int i = 0; i < str.length(); i++) {
            // char[] ch = str.toCharArray();
            // char ch1 = ch[i];
            // s.push(ch1);
            s.push(str.charAt(i));
        }

        String ans = "";
        while (!s.isEmpty()) {
            // ans += s.peek();
            // s.pop();
            ans += s.pop();
        }

        System.out.println(ans);
    }
}
