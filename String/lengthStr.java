package String;
import java.util.Scanner;

public class lengthStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        
        int length = getLength(name);
        System.out.println("Length of the string: " + length);
        
        String reversed = reverseString(name);
        System.out.println("Reversed string: " + reversed);
    }

    static int getLength(String name) {
        return name.length();
    }

    static String reverseString(String name) {
        char[] charArray = name.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
