import java.util.Scanner;

public class LongestWord {

    // Method to find the longest word in a sentence.
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Longest word: " + findLongestWord(sentence));
        sc.close();
    }
}
