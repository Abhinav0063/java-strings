import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // Return null character if no unique character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find first non-repeating character
        char nonRepeatingChar = findFirstNonRepeating(text);
        System.out.println("First Non-Repeating Character: " + nonRepeatingChar);

        scanner.close();
    }
}
