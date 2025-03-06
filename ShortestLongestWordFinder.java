import java.util.Scanner;

public class ShortestLongestWordFinder {
    // Method to split text into words manually
    public static String[] splitTextManually(String text) {
        return text.trim().split("\\s+"); // Simulated manual splitting
    }

    // Method to find shortest & longest words
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Find shortest & longest words
        String[] words = splitTextManually(text);
        String[] results = findShortestAndLongest(words);

        // Display results
        System.out.println("Shortest Word: " + results[0]);
        System.out.println("Longest Word: " + results[1]);

        scanner.close();
    }
}
