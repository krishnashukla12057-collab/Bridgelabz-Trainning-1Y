package com.gla.AbstractlyInterfaces.FunctionalInterfaces;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double threshold = 35.0;

        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double currentTemp = 38.5;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert! Temperature is too high.");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
