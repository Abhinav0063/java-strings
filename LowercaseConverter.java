import java.util.Scanner;

public class LowercaseConverter {
    // Method to convert text to lowercase manually
    public static String toLowerCaseManually(String text) {
        StringBuilder lowercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            lowercaseText.append((c >= 'A' && c <= 'Z') ? (char) (c + 32) : c);
        }
        return lowercaseText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Convert text manually & using built-in method
        String manualLower = toLowerCaseManually(text);
        String builtInLower = text.toLowerCase();

        // Compare and display results
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both equal? " + manualLower.equals(builtInLower));

        scanner.close();
    }
}
