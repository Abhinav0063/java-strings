import java.util.Scanner;

public class CharacterFrequencyNested {
    // Method to find character frequency using nested loops
    public static String[][] findFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        // Find frequency using nested loops
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] == 0) { // Check if character is already counted
                frequency[i] = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0'; // Mark counted character
                    }
                }
            }
        }

        // Store non-zero frequency characters in a 2D array
        int count = 0;
        for (int freq : frequency) {
            if (freq > 0) count++;
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf(characters[i]);
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
