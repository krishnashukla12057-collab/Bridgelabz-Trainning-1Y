package com.gla.AbstractlyInterfaces.DefaultMethods.Payment;

class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via PayPal");
    }
}

class StripeProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Stripe");
    }
}
