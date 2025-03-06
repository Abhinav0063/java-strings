import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray {
    // Method to extract characters manually
    public static char[] extractChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Convert string to character array manually
        char[] manualChars = extractChars(text);
        char[] builtInChars = text.toCharArray();

        // Display results
        System.out.println("Manual Char Array: " + Arrays.toString(manualChars));
        System.out.println("Built-in Char Array: " + Arrays.toString(builtInChars));
        System.out.println("Are both character arrays equal? " + compareCharArrays(manualChars, builtInChars));

        scanner.close();
    }
}
