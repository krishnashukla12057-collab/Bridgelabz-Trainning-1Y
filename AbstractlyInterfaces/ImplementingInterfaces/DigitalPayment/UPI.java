package com.gla.AbstractlyInterfaces.ImplementingInterfaces.DigitalPayment;

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
