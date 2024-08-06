package String;

public class ValidIPAdd {

        public static boolean isValid(String str) {
            String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
          return str.matches(PATTERN); 
        }
        public static void main(String[] args) {
            String str = "222.111.111.111";
            System.out.println(isValid(str));
        }
    }
    

