import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of a substring in a string.
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        // Loop until indexOf returns -1 (substring not found)
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter the substring to count: ");
        String subStr = sc.nextLine();
        System.out.println("Number of occurrences: " + countOccurrences(mainStr, subStr));
        sc.close();
    }
}
