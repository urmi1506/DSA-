import java.util.ArrayList;
import java.util.List;

public class PhnKeyboardEx {
    //vvImp
    public static void main(String[] args) {
       String digits="23";
       List<String>res=letterCombinations(digits);
       System.out.println(res);
    }
    private static void solve(String digits, int index, StringBuilder output, List<String> ans, String[] mapping) {
        //base case
        if(index>=digits.length()){
        ans.add(output.toString());
        return;
        }
        //main logic
        //find no and its mapping
        int num=digits.charAt(index)-'0';
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
        // store whole ans
        List<String>ans=new ArrayList<>();
        // Edge case
        if(digits.length()==0)
        return ans;
        //store only current output
        StringBuilder output=new StringBuilder("");
        //mapping of digits
        String []mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //initialize index
        int index=0;
        solve(digits, index, output, ans, mapping);
        return ans;
    }
}
