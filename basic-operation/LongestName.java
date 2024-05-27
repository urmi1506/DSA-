public class LongestName {
    public static void main(String[] args) {
        int n=5;
        String names[] = { "Geek", "Geeks", "Geeksfor",
  "GeeksforGeek", "GeeksforGeeks" };
  System.out.println(longest(names,n));

    }
    static String longest(String names[], int n) {
         
        if(names.length==0)
         return null;
      String longestName=names[0];
      for(int i=0;i<names.length;i++){
          if(names[i].length()> longestName.length()){
               longestName=names[i];
          }
      }
       return longestName;
  }
}
