import java.util.Scanner;

class SideOfTheSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("Side of the square = " + side);

        sc.close();
    }
}
