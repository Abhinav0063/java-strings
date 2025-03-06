import java.util.Scanner;

public class PalindromeChecker {
    // Method 1: Check palindrome by comparing characters
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Check palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method 3: Check palindrome using reversed string
    public static boolean isPalindromeUsingReverse(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Display results using different methods
        System.out.println("Palindrome Check (Manual Comparison): " + isPalindrome(text));
        System.out.println("Palindrome Check (Recursion): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Palindrome Check (Using Reverse): " + isPalindromeUsingReverse(text));

        scanner.close();
    }
}
