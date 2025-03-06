import java.util.Scanner;

public class CharacterFrequency {
    // Method to find character frequency
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Store results in 2D array
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find frequency and display results
        String[][] frequencies = findFrequency(text);
        System.out.println("\nCharacter Frequency:");
        for (String[] row : frequencies) {
            System.out.printf("Character: %s, Frequency: %s%n", row[0], row[1]);
        }

        scanner.close();
    }
}
