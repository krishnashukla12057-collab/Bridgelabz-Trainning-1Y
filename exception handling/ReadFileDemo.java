package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) {

        // Try-with-resources ensures BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            String firstLine = br.readLine(); // read first line
            System.out.println("First line: " + firstLine);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}