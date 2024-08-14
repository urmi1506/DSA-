package String;

public class LongestCmnSubstring {
    public static int longestCommonSubstr(String str1, String str2) {
        int maxi=0;
        int n=str1.length();
       for(int i=0;i<n;i++){
           String s="";
           for(int j=i;j<n;j++){
               s=s+str1.charAt(j);
               if(str2.contains(s))
                  maxi=Math.max(maxi,s.length()); 
           }
       }
       return maxi;
   }
   public static void main(String[] args) {
    String str1 = "ABCDGH";
    String str2 = "ACDGHR";
    System.out.println(longestCommonSubstr(str1, str2) );
   }
}
