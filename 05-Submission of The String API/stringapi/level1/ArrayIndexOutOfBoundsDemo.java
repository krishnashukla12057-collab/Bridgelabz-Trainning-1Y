package stringapi.level1;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the exception (no handling)
    static void generateException(String[] names) {
        // Accessing index beyond array length
        System.out.println("Name at index 10: " + names[10]);
    }

    // Method to handle the exception using try-catch
    static void handleException(String[] names) {
        try {
            System.out.println("Name at index 10: " + names[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Defining array of names
        String[] names = new String[n];

        // Taking array input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Calling method that generates exception
        System.out.println("\nGenerating Exception:");
        // Uncomment to see abrupt termination
        // generateException(names);

        // Calling method that handles exception
        System.out.println("\nHandling Exception using try-catch:");
        handleException(names);

        sc.close();
    }
}
