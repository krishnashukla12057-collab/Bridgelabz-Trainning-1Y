package JDBCAssignment;
import java.util.*;
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSalaryManager {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Rahul", 35000));
        list.add(new Employee(2, "Aman", 12000));
        list.add(new Employee(3, "Riya", 40000));

        System.out.println("Employees with salary > 30000:");
        for (Employee e : list) {
            if (e.salary > 30000) {
                System.out.println(e.id + " " + e.name + " " + e.salary);
            }
        }

        for (Employee e : list) {
            if (e.id == 1) {
                e.salary = e.salary + (e.salary * 0.10);
            }
        }

        list.removeIf(e -> e.salary < 15000);

        System.out.println("\nFinal Employees:");
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}