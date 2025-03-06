import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character in the string.
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if character is uppercase.
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                // Non-alphabetical characters remain unchanged.
                toggled.append(ch);
            }
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to toggle case: ");
        String input = sc.nextLine();
        System.out.println("Toggled case string: " + toggleCase(input));
        sc.close();
    }
}
