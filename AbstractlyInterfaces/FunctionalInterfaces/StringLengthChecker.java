package com.gla.AbstractlyInterfaces.FunctionalInterfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        Function<String, Integer> getLength = str -> str.length();

        String message = "Hello Java Functional Interface";

        int length = getLength.apply(message);

        if (length > 20) {
            System.out.println("Message exceeds character limit.");
        } else {
            System.out.println("Message is within limit.");
        }

        System.out.println("Length: " + length);
    }
}
