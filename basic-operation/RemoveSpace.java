public class RemoveSpace {
    public static void main(String[] args) {
      String S="geeks  for geeks";
      System.out.println(modify(S));   
    }
    static String modify(String S) {
      S=S.replaceAll("\\s+", "");
      return S;
    }
}
/*\\s+: This is a regular expression that represents one or more whitespace characters (like spaces or tabs).

.replaceAll:used to replace parts of a string with something else.

"":it replaces the matched whitespace characters with an empty string, effectively removing them.*/