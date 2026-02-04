package Javaarray.level2;
import java.util.Scanner;

class StudentGradeUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        /*
           marks[i][0] -> Physics
           marks[i][1] -> Chemistry
           marks[i][2] -> Maths
        */
        int[][] marks = new int[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        // b. Take input for marks with validation
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

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        // c. Calculate percentage and grade using 2D array
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
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

        // d. Display results
        System.out.println("\nStudent Result Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                            " | Physics: " + marks[i][0] +
                            " | Chemistry: " + marks[i][1] +
                            " | Maths: " + marks[i][2] +
                            " | Percentage: " + String.format("%.2f", percentage[i]) +
                            "% | Grade: " + grade[i]
            );
        }
    }
}

