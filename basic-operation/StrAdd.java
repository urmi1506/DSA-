public class StrAdd {
  public static void main(String[] args) {
    String s1="urmi";
    String s2="aaru";
    String s3=s1+""+s2;
    System.out.println(s3);

    String s="hii there";
    s += ' ';
    s += 'o';
    s += 10;
    System.out.println(s);

    // evaluate op from l to r
    System.out.println(10+20+"hii");
    System.out.println("hii"+10+20);
  }  
}
