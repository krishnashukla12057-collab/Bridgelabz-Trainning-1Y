import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String toString() {
        return type + " : " + message;
    }
}

public class HospitalAlerts {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Patient critical", "Emergency"),
                new Alert("Medicine Reminder", "Reminder"),
                new Alert("Appointment Today", "Info")
        );

        // Show only Emergency alerts
        Predicate<Alert> emergency = a -> a.type.equals("Emergency");

        alerts.stream()
                .filter(emergency)
                .forEach(System.out::println);
    }
}