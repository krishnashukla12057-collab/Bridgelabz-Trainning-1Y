package Javaarray.level2;
import java.util.Scanner;

class BMICalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // b. Create arrays
        double[] weight = new double[n];   // in kg
        double[] height = new double[n];   // in meters
        double[] bmi = new double[n];
        String[] status = new String[n];

        // c. Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (meters): ");
            height[i] = sc.nextDouble();
        }

        // d. Calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            // f. BMI Status Table
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // e. Display results
        System.out.println("\nBMI Details of Persons:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " | Height: " + height[i] + " m" +
                            " | Weight: " + weight[i] + " kg" +
                            " | BMI: " + String.format("%.2f", bmi[i]) +
                            " | Status: " + status[i]
            );
        }
    }
}

