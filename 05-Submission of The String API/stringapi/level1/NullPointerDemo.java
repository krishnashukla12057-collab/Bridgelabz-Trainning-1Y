package stringapi.level1;


public class NullPointerDemo {

    // Method to generate NullPointerException
    static void generateException() {
        String text = null;          // initialized to null
        System.out.println(text.length()); // causes exception
    }

    // Method to handle NullPointerException
    static void handleException() {
        String text = null;          // initialized to null

        try {
            System.out.println(text.length()); // risky code
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled");
        }
    }

    public static void main(String[] args) {

        // Call method to generate exception
        // Uncomment to see the exception
        // generateException();

        // Call method to handle exception
        handleException();
    }
}
