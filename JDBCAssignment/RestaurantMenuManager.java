package JDBCAssignment;
import java.util.*;

class Menu {
    int id;
    String itemName;
    double price;

    Menu(int id, String itemName, double price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }
}

public class RestaurantMenuManager {
    public static void main(String[] args) {

        ArrayList<Menu> list = new ArrayList<>();

        list.add(new Menu(1, "Burger", 150));
        list.add(new Menu(2, "Pizza", 300));
        list.add(new Menu(3, "Sandwich", 100));

        System.out.println("Items below 200:");
        for (Menu m : list) {
            if (m.price < 200) {
                System.out.println(m.id + " " + m.itemName + " " + m.price);
            }
        }

        for (Menu m : list) {
            if (m.id == 2) {
                m.price = 250;
            }
        }

        list.removeIf(m -> m.id == 3);

        System.out.println("\nFinal Menu:");
        for (Menu m : list) {
            System.out.println(m.id + " " + m.itemName + " " + m.price);
        }
    }
}