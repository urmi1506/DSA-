public class StringSet1 {
    public static void main(String[] args) {
       String S1="Geeks";
       String S2="forGeeks";
       System.out.println(conRevstr( S1,  S2)); 
    }
    static String conRevstr(String S1, String S2) {
       String constr=S1.concat(S2);
       StringBuilder sb1=new StringBuilder();
       sb1.append(constr);
       sb1.reverse();
       return sb1.toString();
    }
}
