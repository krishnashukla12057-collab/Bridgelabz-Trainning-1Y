package String.BuiltInFuction;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesDisplay {
    public static void main(String[] args) {

        // Formatter for readable output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // GMT Time
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // IST Time
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // PST Time
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display results
        System.out.println("Current Times in Different Time Zones:");
        System.out.println("GMT: " + gmtTime.format(formatter));
        System.out.println("IST: " + istTime.format(formatter));
        System.out.println("PST: " + pstTime.format(formatter));
    }
}

