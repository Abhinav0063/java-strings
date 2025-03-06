import java.util.Scanner;

public class StringLengthFinder {
    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Compare results
        int manualLength = findLength(text);
        int builtInLength = text.length();

        // Display results
        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);

        scanner.close();
    }
}
