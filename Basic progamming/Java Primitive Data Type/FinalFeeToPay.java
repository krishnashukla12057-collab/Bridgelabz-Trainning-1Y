import java.util.Scanner;

class FinalFeeToPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course fee (INR): ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (fee * discountPercent) / 100;
        double finalPrice = fee - discountAmount;

        System.out.println("Discount Amount = INR " + discountAmount);
        System.out.println("Final Fee to Pay = INR " + finalPrice);

        sc.close();
    }
}
