import java.util.Scanner;

public class WordLengthFinder {
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

    // Method to split text into words manually
    public static String[] splitTextManually(String text) {
        return text.trim().split("\\s+"); // Simulated manual splitting
    }

    // Method to create a 2D array with words & their lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] wordData = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordData;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Get words & their lengths
        String[] words = splitTextManually(text);
        String[][] wordData = getWordLengths(words);

        // Display results
        System.out.println("\nWords and Their Lengths:");
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("---------------------------");
        for (String[] row : wordData) {
            System.out.printf("%-15s %-10s%n", row[0], row[1]);
        }

        scanner.close();
    }
}
