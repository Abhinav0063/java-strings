import java.util.Scanner;

public class SubstringComparison {
    // Method to extract substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
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

        // Extract substring manually
        String manualSubstring = substringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);

        // Display results
        System.out.println("Manual Substring: " + manualSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + manualSubstring.equals(builtInSubstring));

        scanner.close();
    }
}
