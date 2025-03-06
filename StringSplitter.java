import java.util.Arrays;
import java.util.Scanner;

public class StringSplitter {
    // Method to split text into words manually
    public static String[] splitTextManually(String text) {
        String[] words = text.trim().split("\\s+"); // Simulated manual splitting
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Split manually & using built-in method
        String[] manualWords = splitTextManually(text);
        String[] builtInWords = text.split(" ");

        // Display results
        System.out.println("Manual Split: " + Arrays.toString(manualWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtInWords));
        System.out.println("Are both equal? " + compareArrays(manualWords, builtInWords));

        scanner.close();
    }
}
