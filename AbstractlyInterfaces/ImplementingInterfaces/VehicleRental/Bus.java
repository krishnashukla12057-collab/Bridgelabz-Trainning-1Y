package com.gla.AbstractlyInterfaces.ImplementingInterfaces.VehicleRental;

class Bus implements VehicleRental {
    public void rent() {
        System.out.println("Bus rented");
    }

    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}
