package Javaarray.level2;
import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number; // handle negative number
        }

        // b. Find count of digits
        int temp = number;
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }

        // c. Store digits in array
        int[] digits = new int[count];
        temp = number;

        if (number == 0) {
            digits[0] = 0;
        } else {
            for (int i = 0; i < count; i++) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }
        }

        // d. Frequency array of size 10 (0–9)
        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // e. Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}

