package JDBCAssignment;
import java.util.*;

class Member {
    int id;
    String name;
    String type;
    int months;

    Member(int id, String name, String type, int months) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.months = months;
    }
}

public class GymMembershipDatabase {
    public static void main(String[] args) {

        ArrayList<Member> list = new ArrayList<>();

        list.add(new Member(1, "Rahul", "Premium", 6));
        list.add(new Member(2, "Aman", "Basic", 2));
        list.add(new Member(3, "Riya", "Premium", 12));

        System.out.println("Premium Members:");
        for (Member m : list) {
            if (m.type.equals("Premium")) {
                System.out.println(m.id + " " + m.name + " " + m.type + " " + m.months);
            }
        }

        for (Member m : list) {
            if (m.id == 2) {
                m.months = m.months + 3;
            }
        }

        list.removeIf(m -> m.months <= 0);

        System.out.println("\nFinal Members:");
        for (Member m : list) {
            System.out.println(m.id + " " + m.name + " " + m.type + " " + m.months);
        }
    }
}