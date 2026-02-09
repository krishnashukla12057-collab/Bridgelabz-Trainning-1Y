package stringapi.level1;

import java.util.Scanner;

public class StringIndexExceptionDemo {

    // Method to generate the exception (no try-catch)
    static void generateException(String str) {
        // Accessing index beyond string length
        System.out.println("Character at index 10: " + str.charAt(10));
    }

    // Method to handle the exception using try-catch
    static void handleException(String str) {
        try {
            System.out.println("Character at index 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: String index is out of bounds!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calling method that generates exception
        System.out.println("\nGenerating Exception:");
        // Uncomment this line to see the program terminate abruptly
        // generateException(input);

        // Calling method that handles exception
        System.out.println("\nHandling Exception using try-catch:");
        handleException(input);

        sc.close();
    }
}

