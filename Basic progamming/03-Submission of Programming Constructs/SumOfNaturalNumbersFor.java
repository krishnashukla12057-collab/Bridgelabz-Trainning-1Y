import java.util.Scanner;

class SumOfNNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check if natural number (including 0)
        if (n >= 0) {

            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + loopSum);

            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("The computations are not equal.");
            }

        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        input.close();
    }
}
