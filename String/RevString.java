package String;

public class RevString {
    public static String reverseString(String s) {
        // code here
        StringBuilder res=new StringBuilder();
        res.append(s);
        res.reverse();
        
        return res.toString();
    }
    public static void main(String[] args) {
        String s="hello";
        System.out.println(reverseString(s));
    }
}
