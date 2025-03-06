import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        System.out.println("Accessing index " + index + ": " + names[index]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handled General Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of names
        String[] names = {"Alice", "Bob", "Charlie"};

        // User input
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();

        // Generate exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Handle exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");
        handleException(names, index);

        scanner.close();
    }
}
