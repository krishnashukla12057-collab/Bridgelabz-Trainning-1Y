package JDBCAssignment;
import java.util.*;

class Sale {
    int id;
    String bookName;
    int quantity;
    double price;

    Sale(int id, String bookName, int quantity, double price) {
        this.id = id;
        this.bookName = bookName;
        this.quantity = quantity;
        this.price = price;
    }
}

public class BookstoreSalesTracking {
    public static void main(String[] args) {

        ArrayList<Sale> list = new ArrayList<>();

        list.add(new Sale(1, "Java", 2, 500));
        list.add(new Sale(2, "Python", 1, 400));
        list.add(new Sale(3, "DSA", 3, 600));

        System.out.println("Sales with quantity > 1:");
        for (Sale s : list) {
            if (s.quantity > 1) {
                System.out.println(s.id + " " + s.bookName + " " + s.quantity + " " + s.price);
            }
        }

        for (Sale s : list) {
            if (s.id == 2) {
                s.quantity = 4;
            }
        }

        list.removeIf(s -> s.id == 1);

        System.out.println("\nFinal Sales:");
        for (Sale s : list) {
            System.out.println(s.id + " " + s.bookName + " " + s.quantity + " " + s.price);
        }
    }
}