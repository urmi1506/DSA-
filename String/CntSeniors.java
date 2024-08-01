package String;

public class CntSeniors{
    public static int countSeniors(String[] details) {
        int cnt=0;
        for (String str : details) {
            int x=str.charAt(11);
            if(x > '6'){
                cnt++;
            }else if (x == '6'){
                if(str.charAt(12)>0) cnt++;
            }
        }
      return cnt;
    }
    public static void main(String[] args) {
        String []details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
}