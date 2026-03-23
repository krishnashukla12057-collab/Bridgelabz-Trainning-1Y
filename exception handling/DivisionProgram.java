package ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");

        } finally {
            scanner.close();
        }
    }
}