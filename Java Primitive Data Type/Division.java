import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        sc.close();
    }
}
