package JDBCAssignment;
import java.util.*;

class Movie {
    int id;
    String name;
    int seats;

    Movie(int id, String name, int seats) {
        this.id = id;
        this.name = name;
        this.seats = seats;
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie(1, "Avengers", 5));
        list.add(new Movie(2, "Batman", 0));
        list.add(new Movie(3, "Spiderman", 10));

        System.out.println("Available Movies:");
        for (Movie m : list) {
            if (m.seats > 0) {
                System.out.println(m.id + " " + m.name + " " + m.seats);
            }
        }

        for (Movie m : list) {
            if (m.id == 1 && m.seats > 0) {
                m.seats = m.seats - 1;
            }
        }

        list.removeIf(m -> m.id == 2);

        System.out.println("\nFinal Movies:");
        for (Movie m : list) {
            System.out.println(m.id + " " + m.name + " " + m.seats);
        }
    }
}