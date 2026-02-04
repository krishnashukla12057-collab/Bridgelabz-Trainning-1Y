package Javaarray.level1;
import java.util.Scanner;

class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Array, total and index initialization
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // c. Break if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // d. Break if array limit reached
            if (index == 10) {
                break;
            }

            // e. Store number and increment index
            arr[index] = num;
            index++;
        }

        // f. Add all elements
        for (int i = 0; i < index; i++) {
            total += arr[i];
        }

        // Display stored values
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }

        // g. Display total
        System.out.println("\nSum of all numbers = " + total);

        sc.close();
    }
}

