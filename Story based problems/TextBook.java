package SmartLibrarySystem;

public class TextBook extends Book {
    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    // Override calculateFine
    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}
