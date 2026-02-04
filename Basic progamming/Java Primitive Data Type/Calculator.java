import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division;

        if (num2 != 0) {
            division = num1 / num2;
        } else {
            division = Double.NaN; 
        }

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        if (num2 != 0) {
            System.out.println("Division = " + division);
        } else {
            System.out.println("Division not possible (cannot divide by zero)");
        }

        sc.close();
    }
}


