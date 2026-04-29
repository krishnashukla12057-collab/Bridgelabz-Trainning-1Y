package JDBCAssignment;
import java.util.*;

class Enrollment {
    int id;
    String student;
    String course;

    Enrollment(int id, String student, String course) {
        this.id = id;
        this.student = student;
        this.course = course;
    }
}

public class OnlineCourseEnrollmentSystem {
    public static void main(String[] args) {

        ArrayList<Enrollment> list = new ArrayList<>();

        list.add(new Enrollment(1, "Rahul", "Java"));
        list.add(new Enrollment(2, "Aman", "Python"));
        list.add(new Enrollment(3, "Riya", "Java"));

        String search = "Java";

        System.out.println("Enrollments in course:");
        for (Enrollment e : list) {
            if (e.course.equals(search)) {
                System.out.println(e.id + " " + e.student + " " + e.course);
            }
        }

        for (Enrollment e : list) {
            if (e.id == 2) {
                e.course = "Java";
            }
        }

        list.removeIf(e -> e.id == 1);

        System.out.println("\nFinal Enrollments:");
        for (Enrollment e : list) {
            System.out.println(e.id + " " + e.student + " " + e.course);
        }
    }
}