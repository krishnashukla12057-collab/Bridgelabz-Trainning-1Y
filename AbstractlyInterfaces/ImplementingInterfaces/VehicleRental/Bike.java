package com.gla.AbstractlyInterfaces.ImplementingInterfaces.VehicleRental;

class Bike implements VehicleRental {
    public void rent() {
        System.out.println("Bike rented");
    }

    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}
