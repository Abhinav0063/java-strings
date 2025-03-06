import java.util.Scanner;

public class UniqueCharacterFrequency {
    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        char[] uniqueChars = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < count; j++) {
                if (uniqueChars[j] == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[count++] = c;
            }
        }
        char[] result = new char[count];
        System.arraycopy(uniqueChars, 0, result, 0, count);
        return result;
    }

    // Method to find frequency using unique characters
    public static void findUniqueCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueChars(text);

        for (char c : uniqueChars) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == c) count++;
            }
            System.out.println("Character: " + c + ", Frequency: " + count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find frequency and display results
        findUniqueCharacterFrequency(text);

        scanner.close();
    }
}
