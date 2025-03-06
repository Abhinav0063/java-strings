import java.util.Scanner;

public class UniqueCharacters {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters and display results
        char[] uniqueChars = findUniqueChars(text);
        System.out.println("Unique Characters: " + new String(uniqueChars));

        scanner.close();
    }
}
