package String;

public class BasicOperations {
    public static void main(String[] args) {
        String s="Hello";
        //len
        System.err.println(s.length());
        System.out.println(" ");
        // char at
        System.out.println(s.charAt(1));
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println(" ");

        // concate
        String s2=s + "world";
        System.out.println(s2);

        System.out.println(" ");

        // equality checks
        boolean eq=s.equals(s2);
        System.out.println(eq);
        System.out.println(" ");

        // contains
        boolean c=s.contains("hel");
        System.out.println(c);
        System.out.println(" ");

        // substring
        String sub=s.substring(1, 4);
        System.out.println(sub);
        System.out.println(" ");

        // reverse
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println(rev);
        System.out.println(" ");

        // convert to char arr
        char[] arr=s.toCharArray();
        System.out.println(arr);
        System.out.println(" ");

        // lower and uppercase
        String lower=s.toLowerCase();
        System.out.println(lower);
        System.out.println(" ");

        String upper=s.toUpperCase();
        System.out.println(upper);
        System.out.println(" ");

        
        // compare
        String name1 ="Tony";
        String name2 ="Tony";

        //1 s1 > s2 : +ve
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve

        if(name1.compareTo(name2) == 0){
           System.out.println("String are equal");
        } else{
            System.out.println("String are not equal");
        }
        System.out.println(" ");

        // following cond not work bcz it create new object
        if(new String("Tony") == new String("Tony")){
            System.out.println("String are equal");
        } else{
            System.out.println("String are not equal");
        }

        //string are immutable ---VVIMP
        
    }
}
