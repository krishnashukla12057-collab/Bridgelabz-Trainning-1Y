package stringapi.level1;

import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert string to uppercase using charAt() and ASCII logic
    static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII difference (32)
                ch = (char) (ch - 32);
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
        String builtInUpper = inputText.toUpperCase();

        // Converting using user-defined method
        String customUpper = convertToUpperCase(inputText);

        // Comparing both results
        boolean result = compareStrings(builtInUpper, customUpper);

        // Displaying results
        System.out.println("\nBuilt-in toUpperCase(): " + builtInUpper);
        System.out.println("User-defined conversion: " + customUpper);
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
