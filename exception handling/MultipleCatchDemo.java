package ExceptionHandling;
import java.util.Scanner;

public class MultipleCatchDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = new int[5];

            System.out.println("Enter 5 elements:");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");

        } finally {
            sc.close();
        }
    }
}