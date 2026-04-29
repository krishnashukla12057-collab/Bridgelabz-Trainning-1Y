package JDBCAssignment;
import java.util.*;

class Task {
    int id;
    String title;
    String status;

    Task(int id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }
}

public class SimpleToDoTaskManager {
    public static void main(String[] args) {

        ArrayList<Task> list = new ArrayList<>();

        list.add(new Task(1, "Study Java", "Pending"));
        list.add(new Task(2, "Complete Assignment", "Completed"));
        list.add(new Task(3, "Practice DSA", "Pending"));

        System.out.println("Pending Tasks:");
        for (Task t : list) {
            if (t.status.equals("Pending")) {
                System.out.println(t.id + " " + t.title + " " + t.status);
            }
        }

        for (Task t : list) {
            if (t.id == 1) {
                t.status = "Completed";
            }
        }

        list.removeIf(t -> t.status.equals("Completed"));

        System.out.println("\nFinal Tasks:");
        for (Task t : list) {
            System.out.println(t.id + " " + t.title + " " + t.status);
        }
    }
}