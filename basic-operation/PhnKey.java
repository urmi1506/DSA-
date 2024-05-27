import java.util.ArrayList;
import java.util.List;

class PhnKey{
    public static void main(String[] args) {
        String digits="2";
       List<String>res=letterCombination(digits);
       System.out.println(res);
    }
    private static void solve(String digits,StringBuilder output,int ind,List<String>ans,String []mapping){
        //Base case
        if(ind>=digits.length()){
            ans.add(output.toString());
            return;
        }
        int num=digits.charAt(ind)-'0';
        String val=mapping[num];
        for (int i = 0; i < val.length(); i++) {
            output.append(val.charAt(i));
            solve(digits, output, ind+1, ans, mapping);
            //Backtracking
            output.deleteCharAt(output.length()-1);
        }
    }
    public static List<String> letterCombination(String digits){
        //store whole ans
        List<String>ans=new ArrayList<>();
        //store only current output
        StringBuilder output=new StringBuilder("");
        int ind=0;
        //Edge case
        if(digits.length()==0)
        return ans;
       //mapping no
       String []mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       solve(digits,output,ind,ans,mapping);
       return ans;


    }
    
}