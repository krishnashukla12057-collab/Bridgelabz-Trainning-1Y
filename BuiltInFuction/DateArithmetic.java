package String.BuiltInFuction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define input format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Convert string to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, 2 years
        LocalDate result = date.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        result = result.minusWeeks(3);

        // Display results
        System.out.println("Original Date: " + date);
        System.out.println("Final Date after calculations: " + result);

        sc.close();
    }
}
