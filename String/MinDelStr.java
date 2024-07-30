package String;

public class MinDelStr {
    public static int minimumDeletions(String s) {
        int ans = 0, cnt = 0;
       for (char c : s.toCharArray()){
           if (c == 'b')
               cnt++;
           // c=a & cnt != 0
           else if (cnt != 0){
               ans++;
               cnt--;
           }
       }
       return ans;
   }
   public static void main(String[] args) {
     String s="aababbab";
     System.out.println(minimumDeletions(s));

   }
}
