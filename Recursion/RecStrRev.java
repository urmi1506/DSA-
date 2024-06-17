package Recursion;

public class RecStrRev {
    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = reverse(str, 0, str.length() - 1);
        System.out.println("Reversed string: " + reversedStr);
    }

    static String reverse(String s, int i, int j) {
        // Base case 
        if (i >= j) {
            return s;
        }
        
        // Convert the string to a character array for swapping
        char[] charArray = s.toCharArray();
        
        // Swap characters at positions i and j
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        
        // Convert the character array back to a string
        String swappedString = new String(charArray);
        
        // Recursive call with updated indices
        return reverse(swappedString, i + 1, j - 1);
    }
}
