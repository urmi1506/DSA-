package Stack;

import java.util.Stack;

public class CheckParanthesis {
    public static boolean isValid(String s){
        // initialize stack
        Stack<Character> s1=new Stack<>();
        // traverse string
        for (int i = 0; i < s.length(); i++) {
            char curr=s.charAt(i);
            // check open paranthesis
            if(curr == '{' || curr == '[' || curr == '('){
                s1.push(curr);
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }
                else{
                    // check back paranthesis
                    char top=s1.pop();
                    if(curr== '}'  && top != '{'  ||curr==']' && top != '[' || curr== ')' && top != '('){
                        return false;
                    }
                }
            }

        }
    return s1.isEmpty();
    }
    public static void main(String[] args) {
        String s=  "(]";
        System.out.println(isValid(s));
    }
}
