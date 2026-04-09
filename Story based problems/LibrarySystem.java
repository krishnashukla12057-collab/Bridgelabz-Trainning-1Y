package SmartLibrarySystem;

public class LibrarySystem {
    public static void main(String[] args) {

        Book b1 = new TextBook(101, "Java Programming", 500);
        Book b2 = new Magazine(201, "Tech Today", 200);

        int lateDays = 4;

        b1.displayDetails();
        System.out.println("Fine: ₹" + b1.calculateFine(lateDays));

        System.out.println();

        b2.displayDetails();
        System.out.println("Fine: ₹" + b2.calculateFine(lateDays));
    }
}
