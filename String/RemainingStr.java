package String;
public class RemainingStr {
    public static String printString(String s, char ch, int count) {
        int cnt2 = 0;
       
       for(int i=0;i<s.length();i++){
           if(s.charAt(i) == ch){
               cnt2++;
               if(cnt2 == count){
                   return s.substring(i+1);
               }
           }
       }
       return "";
   }
   public static void main(String[] args) {
    String s = "Thisisdemostring";
    char ch = 'i';
    int count = 3;
    System.out.println(printString(s, ch, count));
   }
}
