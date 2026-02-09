package stringapi.level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate runtime exception (no handling)
    static void generateException(String str) {
        // Start index is greater than end index
        System.out.println("Substring: " + str.substring(5, 2));
    }

    // Method to handle exception using try-catch
    static void handleException(String str) {
        try {
            // Again using invalid start and end index
            System.out.println("Substring: " + str.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: Invalid substring indexes");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calling method that generates exception
        System.out.println("\nGenerating Exception:");
        // Uncomment to see abrupt termination
        // generateException(input);

        // Calling method that handles exception
        System.out.println("\nHandling Exception using try-catch:");
        handleException(input);

        sc.close();
    }
}
