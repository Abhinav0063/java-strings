import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string.
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        // Loop through each character and append it if it's not already in result.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("String after removing duplicates: " + removeDuplicates(input));
        sc.close();
    }
}
