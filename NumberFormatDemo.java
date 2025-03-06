import java.util.Scanner;

public class NumberFormatDemo {
    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text); // Will throw exception if text is not a number
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handled General Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number (or invalid text): ");
        String text = scanner.next();

        // Generate exception
        System.out.println("\nGenerating NumberFormatException...");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Handle exception
        System.out.println("\nHandling NumberFormatException...");
        handleException(text);

        scanner.close();
    }
}
