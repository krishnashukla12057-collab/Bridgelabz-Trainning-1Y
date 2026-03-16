package com.gla.AbstractlyInterfaces.DefaultMethods.Smart;

class ElectricCar implements VehicleDashboard {

    public void displaySpeed() {
        System.out.println("Electric Car Speed: 70 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}
