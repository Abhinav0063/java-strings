import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI and determine status
    public static String[][] computeBMI(double[][] data) {
        String[][] results = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height);
            String status = (bmi <= 18.4) ? "Underweight" :
                            (bmi <= 24.9) ? "Normal" :
                            (bmi <= 39.9) ? "Overweight" : "Obese";

            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", data[i][1]);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    // Method to display BMI results
    public static void displayBMI(String[][] data) {
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        System.out.println("-------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] persons = new double[10][2];

        // User input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (kg) for person %d: ", i + 1);
            persons[i][0] = scanner.nextDouble();
            System.out.printf("Enter height (cm) for person %d: ", i + 1);
            persons[i][1] = scanner.nextDouble();
        }

        // Compute BMI and display results
        String[][] results = computeBMI(persons);
        displayBMI(results);

        scanner.close();
    }
}
