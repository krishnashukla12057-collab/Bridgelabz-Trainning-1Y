import java.util.Scanner;

class AreaOfTriangle2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle in cm: ");
        double baseCm = sc.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double heightCm = sc.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;

        double areaIn2 = areaCm2 / 6.4516;

        System.out.println("Area of triangle:");
        System.out.println("In square centimeters = " + areaCm2);
        System.out.println("In square inches = " + areaIn2);

        sc.close();
    }
}
