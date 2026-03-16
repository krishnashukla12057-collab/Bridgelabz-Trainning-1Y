package com.gla.AbstractlyInterfaces.DefaultMethods.Smart;

interface VehicleDashboard {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery feature not available.");
    }
}
