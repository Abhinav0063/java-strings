import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string manually.
    public static String reverse(String str) {
        String reversed = "";
        // Loop from the end to the beginning of the string.
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        System.out.println("Reversed String: " + reverse(input));
        sc.close();
    }
}
