package SmartLibrarySystem;

public class Magazine extends Book {

    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    // Override calculateFine
    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}
