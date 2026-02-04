package Javaarray.level2;
import java.util.Scanner;

class StudentGradeCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create arrays
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Take input for marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            int p = sc.nextInt();

            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            System.out.print("Maths: ");
            int m = sc.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks! Please enter positive values.\n");
                i--; // repeat input
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // e. Display results
        System.out.println("\nStudent Result Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                            " | Physics: " + physics[i] +
                            " | Chemistry: " + chemistry[i] +
                            " | Maths: " + maths[i] +
                            " | Percentage: " + String.format("%.2f", percentage[i]) +
                            "% | Grade: " + grade[i]
            );
        }
    }
}

