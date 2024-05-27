import java.util.Scanner;
public class StrFun1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    System.out.println(s1);
    System.out.println("String length"+" "+s1.length());
    char ch=s1.charAt(0);
    System.out.println("Character present at index"+" "+ch);
    for (int i = 0; i < s1.length(); i++) {
        char ch1=s1.charAt(i);
        System.out.println("Read all character"+" "+ch1);
        // we cant set char in string ...use stringbuilder
    }
  }  
}
