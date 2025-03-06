import java.util.Scanner;

public class UppercaseConverter {
    // Method to convert text to uppercase manually
    public static String toUpperCaseManually(String text) {
        StringBuilder uppercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            uppercaseText.append((c >= 'a' && c <= 'z') ? (char) (c - 32) : c);
        }
        return uppercaseText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Convert text manually & using built-in method
        String manualUpper = toUpperCaseManually(text);
        String builtInUpper = text.toUpperCase();

        // Compare and display results
        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both equal? " + manualUpper.equals(builtInUpper));

        scanner.close();
    }
}
