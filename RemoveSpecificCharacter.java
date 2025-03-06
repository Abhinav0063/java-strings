import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove all occurrences of a specific character.
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);
        System.out.println("Modified String: " + removeCharacter(input, ch));
        sc.close();
    }
}
