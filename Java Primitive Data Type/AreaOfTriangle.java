import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double baseInch = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInch = sc.nextDouble();

        double areaInSquareInches = 0.5 * baseInch * heightInch;
        double areaInSquareCm = areaInSquareInches * 6.4516;

        System.out.println("Area of Triangle:");
        System.out.println("In square inches = " + areaInSquareInches);
        System.out.println("In square centimeters = " + areaInSquareCm);

        sc.close();
    }
}
