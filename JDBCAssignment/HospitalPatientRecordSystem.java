package JDBCAssignment;
import java.util.*;

class Patient {
    int id;
    String name;
    String disease;

    Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }
}

public class HospitalPatientRecordSystem {
    public static void main(String[] args) {

        ArrayList<Patient> list = new ArrayList<>();

        list.add(new Patient(1, "Rahul", "Fever"));
        list.add(new Patient(2, "Aman", "Cold"));
        list.add(new Patient(3, "Riya", "Fever"));

        String search = "Fever";

        System.out.println("Patients with disease:");
        for (Patient p : list) {
            if (p.disease.equals(search)) {
                System.out.println(p.id + " " + p.name + " " + p.disease);
            }
        }

        for (Patient p : list) {
            if (p.id == 1) {
                p.disease = "Recovered";
            }
        }

        list.removeIf(p -> p.id == 2);

        System.out.println("\nFinal Patients:");
        for (Patient p : list) {
            System.out.println(p.id + " " + p.name + " " + p.disease);
        }
    }
}