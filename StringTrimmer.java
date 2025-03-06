import java.util.Scanner;

public class StringTrimmer {
    // Method to trim leading and trailing spaces manually
    public static String manualTrim(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        return text.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string with spaces: ");
        String text = scanner.nextLine();

        // Trim spaces manually & using built-in method
        String manualTrimmed = manualTrim(text);
        String builtInTrimmed = text.trim();

        // Display results
        System.out.println("\nManual Trimmed: [" + manualTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");
        System.out.println("Are both equal? " + manualTrimmed.equals(builtInTrimmed));

        scanner.close();
    }
}
