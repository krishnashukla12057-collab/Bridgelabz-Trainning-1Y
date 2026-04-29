package JDBCAssignment;
import java.util.*;

class Product {
    int pid;
    String pname;
    int qty;

    Product(int pid, String pname, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
    }
}

public class ProductInventoryTracker {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product(1, "Pen", 5));
        list.add(new Product(2, "Book", 20));
        list.add(new Product(3, "Pencil", 8));

        System.out.println("Low Stock Products:");
        for (Product p : list) {
            if (p.qty < 10) {
                System.out.println(p.pid + " " + p.pname + " " + p.qty);
            }
        }

        for (Product p : list) {
            if (p.pid == 1) {
                p.qty = p.qty + 10;
            }
        }

        list.removeIf(p -> p.pid == 3);

        System.out.println("\nFinal Products:");
        for (Product p : list) {
            System.out.println(p.pid + " " + p.pname + " " + p.qty);
        }
    }
}