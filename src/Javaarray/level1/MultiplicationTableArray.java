package Javaarray.level1;
import java.util.Scanner;

class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];   // array to store multiplication results

        // b. Store results from 1 to 10
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // c. Display the multiplication table
        System.out.println("\nMultiplication Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}

