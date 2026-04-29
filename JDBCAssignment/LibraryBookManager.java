package JDBCAssignment;
import java.util.*;

class Book {
    int id;
    String title;
    String author;
    String status;

    Book(int id, String title, String author, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }
}

public class LibraryBookManager {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();

        list.add(new Book(1, "Java Basics", "James", "Available"));
        list.add(new Book(2, "DSA", "Mark", "Issued"));
        list.add(new Book(3, "Python", "Guido", "Available"));

        System.out.println("Available Books:");
        for (Book b : list) {
            if (b.status.equals("Available")) {
                System.out.println(b.id + " " + b.title + " " + b.author + " " + b.status);
            }
        }

        for (Book b : list) {
            if (b.id == 1) {
                b.status = "Issued";
            }
        }

        list.removeIf(b -> b.id == 2);

        System.out.println("\nFinal Books:");
        for (Book b : list) {
            System.out.println(b.id + " " + b.title + " " + b.author + " " + b.status);
        }
    }
}