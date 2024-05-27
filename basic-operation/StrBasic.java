import java.util.Scanner;

public class StrBasic {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");

        try (Scanner sc = new Scanner(System.in)) {
            char[] nameArray = new char[10]; // Increased size for longer names
            for (int i = 0; i < nameArray.length; i++) {
                nameArray[i] = sc.next().charAt(0);
            }

            // Truncate name if longer than 4 characters
            String name = new String(nameArray).substring(0, 4);

            // Print the name
            System.out.println(name);
        }
    }
}
