package JDBCAssignment;
import java.util.*;

class Customer {
    int id;
    String name;
    String phone;

    Customer(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}

public class CustomerContactDirectory {
    public static void main(String[] args) {

        ArrayList<Customer> list = new ArrayList<>();

        list.add(new Customer(1, "Rahul", "9999999999"));
        list.add(new Customer(2, "Aman", "8888888888"));
        list.add(new Customer(3, "Riya", "7777777777"));

        String search = "Ra";

        System.out.println("Search Result:");
        for (Customer c : list) {
            if (c.name.contains(search)) {
                System.out.println(c.id + " " + c.name + " " + c.phone);
            }
        }

        for (Customer c : list) {
            if (c.id == 1) {
                c.phone = "1111111111";
            }
        }

        list.removeIf(c -> c.id == 2);

        System.out.println("\nFinal Customers:");
        for (Customer c : list) {
            System.out.println(c.id + " " + c.name + " " + c.phone);
        }
    }
}