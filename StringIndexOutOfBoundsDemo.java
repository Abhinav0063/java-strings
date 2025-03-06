import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("Accessing character at position " + text.length() + "...");
        System.out.println(text.charAt(text.length())); // This will throw exception
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Accessing character at position " + text.length() + "...");
            System.out.println(text.charAt(text.length())); // This will throw exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Generate exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException...");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Handle exception
        System.out.println("\nHandling StringIndexOutOfBoundsException...");
        handleException(text);

        scanner.close();
    }
}
