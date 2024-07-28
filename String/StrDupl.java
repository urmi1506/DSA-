package String;

public class StrDupl {
    String removeDups(String str) {
        String result = "";  
        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {  
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StrDupl strDupl = new StrDupl();
        String input = "aabbccddeeff";
        String output = strDupl.removeDups(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + output);
    }
}
