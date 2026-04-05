package String;
public class ReverseWord{
    public static String reverseWords(String s) {
        // Trim the string to remove leading & trailing spaces
        // Split using "\\s+" to handle multiple spaces as single separator
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for(int i = words.length -1; i>=0; i--){
            reversed.append(words[i]);

            if(i != 0) reversed.append(" ");
        }
    return reversed.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverseWords(s);
        System.out.println(ans);

    }

}