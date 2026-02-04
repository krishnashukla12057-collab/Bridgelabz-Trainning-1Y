class  DiscountAmount{
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discountAmount = (fee * discountPercent) / 100;
        double finalPrice = fee - discountAmount;

        System.out.println("Discount Amount = INR " + discountAmount);
        System.out.println("Discounted Price = INR " + finalPrice);
    }
}
