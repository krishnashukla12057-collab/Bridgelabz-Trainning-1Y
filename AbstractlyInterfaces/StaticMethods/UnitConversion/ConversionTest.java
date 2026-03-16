package com.gla.AbstractlyInterfaces.StaticMethods.UnitConversion;

public class ConversionTest {
    public static void main(String[] args) {

        double miles = UnitConverter.kmToMiles(10);
        double lbs = UnitConverter.kgToLbs(5);

        System.out.println("10 km in miles: " + miles);
        System.out.println("5 kg in pounds: " + lbs);
    }
}
