import java.util.Scanner;

class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double cm = sc.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Height = " + feet + " feet " + inches + " inches");

        sc.close();
    }
}
