import java.util.Scanner;

public class IllegalArgumentDemo {
    // Method to generate IllegalArgumentException
    public static void generateException(String text, int start, int end) {
        System.out.println(text.substring(start, end)); // Will throw IllegalArgumentException if start > end
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handled General Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Generate exception
        System.out.println("\nGenerating IllegalArgumentException...");
        try {
            generateException(text, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Handle exception
        System.out.println("\nHandling IllegalArgumentException...");
        handleException(text, start, end);

        scanner.close();
    }
}
