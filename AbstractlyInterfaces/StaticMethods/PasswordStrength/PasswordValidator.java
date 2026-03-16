package com.gla.AbstractlyInterfaces.StaticMethods.PasswordStrength;

public class PasswordValidator {
    public static void main(String[] args) {

        String password = "Secure123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
