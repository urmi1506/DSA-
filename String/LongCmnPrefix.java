package String;

public class LongCmnPrefix {
    static String longestCommonPrefix(String arr[]) {
        int n = arr.length;
        if (n == 0) return "";

        //minimum length string
        int minLen = arr[0].length();
        for (int i = 1; i < n; i++) {
            minLen = Math.min(minLen, arr[i].length());
        }

        // Compare each characters
        StringBuilder longestStr = new StringBuilder();
        for (int j = 0; j < minLen; j++) {
            char ch = arr[0].charAt(j);
            for (int i = 1; i < n; i++) {
                if (arr[i].charAt(j) != ch) {
                    return longestStr.length() == 0 ? "-1" : longestStr.toString();
                }
            }
            longestStr.append(ch);
        }

        return longestStr.toString();
    }
    public static void main(String[] args) {
    
        String[] arr1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr1)); 
    
        String[] arr2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(arr2)); 
    
        String[] arr3 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr3)); 
    }
    
}
 
