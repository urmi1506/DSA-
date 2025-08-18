package String;

public class BasicOperations {
    public static void main(String[] args) {
        String s="Hello";
        //len
        System.err.println(s.length());
        // char at
        System.out.println(s.charAt(1));
        // concate
        String s2=s + "world";
        System.out.println(s2);
        // equality checks
        boolean eq=s.equals(s2);
        System.out.println(eq);
        // contains
        boolean c=s.contains("hel");
        System.out.println(c);
        // substring
        String sub=s.substring(1, 4);
        System.out.println(sub);
        // reverse
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println(rev);
        // convert to char arr
        char[] arr=s.toCharArray();
        System.out.println(arr);
        // lower and uppercase
        String lower=s.toLowerCase();
        System.out.println(lower);
        String upper=s.toUpperCase();
        System.out.println(upper);
        
    }
}
