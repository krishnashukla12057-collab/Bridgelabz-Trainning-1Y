package Javaarray.level2;
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalEmployees = 10;

        // b. Arrays to store salary and years of service
        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];

        // c. Arrays to store bonus and new salary
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // d. Take input with validation
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.\n");
                i--; // decrement index to repeat input
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // e. Calculate bonus, new salary, and totals
        for (int i = 0; i < totalEmployees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // f. Display results
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println(
                    "Employee " + (i + 1) +
                            " | Old Salary: " + salary[i] +
                            " | Bonus: " + bonus[i] +
                            " | New Salary: " + newSalary[i]
            );
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
