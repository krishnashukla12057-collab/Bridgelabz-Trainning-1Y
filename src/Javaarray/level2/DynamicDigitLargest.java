package Javaarray.level2;
import java.util.Scanner;

class DynamicDigitLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number; // handle negative number
        }

        // b. Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d, e, f. Extract digits with dynamic resizing
        while (number != 0) {

            // a. If index equals maxDigit, increase size by 10
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                // b. Create temp array and copy elements
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // c. Assign digits array to temp
                digits = temp;
            }

            digits[index] = number % 10; // store last digit
            number = number / 10;        // remove last digit
            index++;
        }

        // g. Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);
    }
}
