package Javaarray.level2;
import java.util.Scanner;

class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter height (meters): ");
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input! Please enter positive values.\n");
                i--; // repeat input for same person
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // d. Calculate BMI and weight status
        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height); // BMI

            double bmi = personData[i][2];

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display results
        System.out.println("\nBMI Details:");
        for (int i = 0; i < number; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " | Weight: " + personData[i][0] + " kg" +
                            " | Height: " + personData[i][1] + " m" +
                            " | BMI: " + String.format("%.2f", personData[i][2]) +
                            " | Status: " + weightStatus[i]
            );
        }
    }
}

