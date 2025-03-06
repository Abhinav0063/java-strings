import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings lexicographically.
    public static int compareStrings(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        // Compare each character one by one.
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        // If all characters are same up to the length of the shorter string, compare lengths.
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = sc.nextLine();
        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        int result = compareStrings(first, second);
        if (result < 0) {
            System.out.println("\"" + first + "\" comes before \"" + second + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + second + "\" comes before \"" + first + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal lexicographically.");
        }
        sc.close();
    }
}
