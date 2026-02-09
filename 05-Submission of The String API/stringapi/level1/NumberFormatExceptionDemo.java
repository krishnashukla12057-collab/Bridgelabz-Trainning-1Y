package stringapi.level1;
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate the exception (no try-catch)
    static void generateException(String text) {
        // Trying to convert non-numeric text into integer
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle the exception using try-catch
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format!");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calling method that generates exception
        System.out.println("\nGenerating Exception:");
        // Uncomment this line to see abrupt termination
        // generateException(input);

        // Calling method that handles exception
        System.out.println("\nHandling Exception using try-catch:");
        handleException(input);

        sc.close();
    }
}
