import java.util.Scanner;

public class VowelConsonantCounter {
    // Method to check if a character is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }

    // Method to count vowels & consonants
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Count vowels & consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display results
        System.out.println("Vowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);

        scanner.close();
    }
}
