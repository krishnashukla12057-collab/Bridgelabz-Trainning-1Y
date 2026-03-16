package com.gla.AbstractlyInterfaces.DefaultMethods.Smart;

public class VehicleTest {
    public static void main(String[] args) {

        VehicleDashboard v1 = new Car();
        VehicleDashboard v2 = new ElectricCar();

        v1.displaySpeed();
        v1.displayBattery();

        v2.displaySpeed();
        v2.displayBattery();
    }
}
