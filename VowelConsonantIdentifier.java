import java.util.Scanner;

public class VowelConsonantIdentifier {
    // Method to classify characters
    public static String classifyCharacter(char c) {
        c = Character.toLowerCase(c);
        if ("aeiou".indexOf(c) != -1) return "Vowel";
        else if (Character.isLetter(c)) return "Consonant";
        else return "Not a Letter";
    }

    // Method to analyze a string and store results in a 2D array
    public static String[][] analyzeCharacters(String text) {
        String[][] analysis = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            analysis[i][0] = String.valueOf(c);
            analysis[i][1] = classifyCharacter(c);
        }
        return analysis;
    }

    // Method to display results in a table format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter Analysis:");
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Analyze characters and display results
        String[][] analysis = analyzeCharacters(text);
        displayTable(analysis);

        scanner.close();
    }
}
