
import java.util.*;

public class GenerateParenthesis{
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(0,0,"",n,ans);
        return ans;
    }
    public static void dfs(int openP ,int closeP ,String s ,int n , List<String> ans){
        // edge case
        if(openP == closeP && openP + closeP == n * 2){
            ans.add(s);
            return;
        }
        if(openP < n){
            dfs(openP + 1 ,closeP , s + "(" , n ,ans);
        }
        if(closeP < openP){
            dfs(openP , closeP+1 , s + ")" , n , ans);
        }
    }
    public static void main(String[] args) {
        int n =2;
        List<String> paranthesis = generateParenthesis(n);
        System.out.println(paranthesis);
    }
}