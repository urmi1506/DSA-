public class StrRevEx {
    public static void main(String[] args) {
        String s = "urmi";
        reverse(s);
    }

    static void reverse(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
