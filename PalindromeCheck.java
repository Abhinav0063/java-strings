import java.util.Scanner;

public class PalindromeCheck {

    // Method to check if a string is a palindrome.
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lower case for fairness.
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        // Compare characters from the start and end moving towards the center.
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();
        if (isPalindrome(input))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
        sc.close();
    }
}
