package stringapi.level1;
import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert string to lowercase using charAt() and ASCII logic
    static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference (32)
                ch = (char) (ch + 32);
            }

            result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter complete text: ");
        String inputText = sc.nextLine();

        // Converting using built-in method
        String builtInLower = inputText.toLowerCase();

        // Converting using user-defined method
        String customLower = convertToLowerCase(inputText);

        // Comparing both results
        boolean result = compareStrings(builtInLower, customLower);

        // Displaying results
        System.out.println("\nBuilt-in toLowerCase(): " + builtInLower);
        System.out.println("User-defined conversion: " + customLower);
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
