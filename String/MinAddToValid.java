package String;

public class MinAddToValid {
    public static int minAddToMakeValid(String s) {
        // check ( present and ) required
        int open =0;
        // check ) present and ( required
        int add =0;

        // convert string to charArr -->check each paranthesis
        for(char c : s.toCharArray()){
            // cnt ( paranthesis
            if (c == '('){
                open++;
            }
            else{
                // check their is ( present for current )
                if(open > 0){
                    open--;
                }
                // if not present add (
                else{
                    add++;
                }
            }
        }
    // return add + open --> tell how many ( + ) required
    return add + open;
    }
    public static void main(String[] args) {
        String s ="())";
        int res = minAddToMakeValid(s);
        System.out.println(res);
    }
}
