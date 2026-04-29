package JDBCAssignment;
import java.util.*;

class Vehicle {
    String regNo;
    String owner;
    String status;

    Vehicle(String regNo, String owner, String status) {
        this.regNo = regNo;
        this.owner = owner;
        this.status = status;
    }
}

public class VehicleServiceCenter {
    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();

        list.add(new Vehicle("UP14AB1234", "Rahul", "Pending"));
        list.add(new Vehicle("UP14CD5678", "Aman", "Completed"));
        list.add(new Vehicle("UP14EF9012", "Riya", "Pending"));

        System.out.println("Pending Vehicles:");
        for (Vehicle v : list) {
            if (v.status.equals("Pending")) {
                System.out.println(v.regNo + " " + v.owner + " " + v.status);
            }
        }

        for (Vehicle v : list) {
            if (v.regNo.equals("UP14AB1234")) {
                v.status = "Completed";
            }
        }

        list.removeIf(v -> v.regNo.equals("UP14CD5678"));

        System.out.println("\nFinal Vehicles:");
        for (Vehicle v : list) {
            System.out.println(v.regNo + " " + v.owner + " " + v.status);
        }
    }
}