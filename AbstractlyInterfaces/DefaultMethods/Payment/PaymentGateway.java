package com.gla.AbstractlyInterfaces.DefaultMethods.Payment;

public class PaymentGateway {
    public static void main(String[] args) {

        PaymentProcessor p1 = new PayPalProcessor();
        PaymentProcessor p2 = new StripeProcessor();

        p1.processPayment(500);
        p1.refund(200);

        p2.processPayment(1000);
        p2.refund(300);
    }
}
