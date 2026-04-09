package SmartLibrarySystem;

class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "City Central Library";
    // Constructor
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Method to calculate fine
    double calculateFine(int daysLate) {
        return 0;
    }

    // Display book details
    void displayDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

