public class RevString {
    public static void main(String[] args) {
       String S="GeeksforGeeks";
       System.out.println( revStr( S)); 
    }
    static String revStr(String S) {
        StringBuilder sb1=new StringBuilder();
        sb1.append(S);
        sb1.reverse();
        return sb1.toString();
    }
}
